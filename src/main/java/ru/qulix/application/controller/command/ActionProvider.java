package ru.qulix.application.controller.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.qulix.application.controller.JspPath;
import ru.qulix.application.controller.router.Router;

public class ActionProvider {

    private static Logger log = LogManager.getLogger(ActionProvider.class);

    private ActionProvider() {}

    public static ActionCommand defineAction(String action) {
        ActionCommand command = (request, response) -> new Router(JspPath.ERROR_404);
        try {
            if (action !=null) {
                //command parsing
            }
        } catch (IllegalArgumentException ex) {
            log.error(ex);
        }
        return command;
    }
}
