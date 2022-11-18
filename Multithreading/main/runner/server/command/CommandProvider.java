package runner.server.command;

import runner.server.command.exception.CommandException;
import runner.server.command.impl.*;
import runner.server.command.impl.*;

public class CommandProvider {
    private static final CommandProvider INSTANCE = new CommandProvider();

    private CommandProvider() {
    }

    public static CommandProvider getInstance() {
        return INSTANCE;
    }

    public Command getCommand(String request) throws CommandException {
        if (request == null) throw new CommandException("No such command!");
        String[] arguments = request.split(" ");
        if (arguments.length < 1) throw new CommandException("No such command!");
        return switch (arguments[0]) {
            case "AUTH" -> new AuthCommand();
            case "DISCONNECT" -> new DisconnectCommand();
            case "EDIT" -> new EditCommand();
            case "VIEW" -> new ViewCommand();
            case "CREATE" -> new CreateCommand();
            default -> throw new CommandException("No such command!");
        };
    }
}
