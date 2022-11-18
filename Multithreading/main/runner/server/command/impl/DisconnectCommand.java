package runner.server.command.impl;

import runner.server.command.Command;
import runner.server.command.exception.CommandException;
import runner.server.model.AuthType;
import runner.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Thanks for connection!";
    }
}
