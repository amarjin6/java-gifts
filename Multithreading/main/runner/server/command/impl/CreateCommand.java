package runner.server.command.impl;

import runner.server.command.Command;
import runner.server.command.exception.CommandException;
import runner.server.model.AuthType;
import runner.server.service.ServiceFactory;

public class CreateCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        String[] arguments = request.split(" ");
        if (arguments.length != 3) throw new CommandException("CREATE invalid syntax!");

        if (ServiceFactory.getInstance().getAuthService().getAuthType(caller) != AuthType.MANAGER)
            return "Rejected in access! Should be a manager or higher";

        ServiceFactory.getInstance().getCaseService().addCase(arguments[1], arguments[2]);
        return "Success!";
    }
}
