package runner.server.command;

import runner.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
