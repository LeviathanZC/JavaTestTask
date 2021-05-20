package ru.qulix.application.controller;

import ru.qulix.application.controller.command.ActionCommand;
import ru.qulix.application.controller.command.ActionProvider;
import ru.qulix.application.controller.router.Router;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processing(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processing(request, response);
    }

    private void processing(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ActionCommand command = ActionProvider.defineAction(request.getParameter(RequestParam.COMMAND));
        Router router = command.execute(request, response);
        switch (router.getType()) {
            case FORWARD: {
                request.getRequestDispatcher(router.getPage()).forward(request, response);
                break;
            }
            case REDIRECT: {
                response.sendRedirect(router.getPage());
                break;
            }
            case INCLUDE: {
                request.getRequestDispatcher(router.getPage()).include(request, response);
                break;
            }
        }
    }

}
