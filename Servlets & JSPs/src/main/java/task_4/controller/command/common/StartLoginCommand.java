package task_4.controller.command.common;

import task_4.controller.command.Command;
import task_4.controller.command.CommandResult;
import task_4.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartLoginCommand implements Command {

    private static final String LOGIN_PAGE = "/WEB-INF/pages/login.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
