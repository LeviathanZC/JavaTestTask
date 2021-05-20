package ru.qulix.application.controller.command;

import ru.qulix.application.controller.JspPath;
import ru.qulix.application.controller.router.Router;

public enum CommandType {

    WELCOME_GET((request, response) -> new Router(JspPath.WELCOME));

    private final ActionCommand command;

    CommandType(ActionCommand command) { this.command = command; }

    public ActionCommand getCurrent() {
        return command;
    }
}
