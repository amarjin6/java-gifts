package runner.server.command.impl;

import runner.server.command.Command;
import runner.server.command.exception.CommandException;
import runner.server.model.AuthType;
import runner.server.service.ServiceFactory;

public class AuthCommand implements Command {
    @Override
    public String complete(Object caller, String request) throws CommandException {
        String[] arguments = request.split(" ");
        if (arguments.length != 2) throw new CommandException("AUTH command should contain 1 argument!");
        AuthType authType;
        try {
            authType = AuthType.valueOf(arguments[1]);
        } catch (IllegalArgumentException e) {
            throw new CommandException("No such type of authentication!");
        }

        ServiceFactory.getInstance().getAuthService().setAuthType(caller, authType);
        return "Success!";
    }
}
