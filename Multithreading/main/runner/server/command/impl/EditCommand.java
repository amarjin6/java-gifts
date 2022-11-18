package runner.server.command.impl;

import runner.server.command.Command;
import runner.server.command.exception.CommandException;
import runner.server.model.AuthType;
import runner.server.service.ServiceFactory;

public class EditCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        String[] arguments = request.split(" ");
        if (arguments.length != 4) throw new CommandException("Invalid syntax EDIT");

        if (ServiceFactory.getInstance().getAuthService().getAuthType(caller) != AuthType.MANAGER)
            return "Rejected in access! Should be a manager or higher";

        int id;
        try {
            id = Integer.parseInt(arguments[1]);
        } catch (NumberFormatException ignored) {
            return "Invalid id!";
        }

        if (!ServiceFactory.getInstance().getCaseService().containsCase(id))
            return "No such case!";

        ServiceFactory.getInstance().getCaseService().editCase(id, arguments[2], arguments[3]);
        return "Success!";
    }
}
