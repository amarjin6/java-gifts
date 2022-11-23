package task_4.specification.user;

import task_4.specification.Specification;

import java.util.Arrays;
import java.util.List;

public class FindByUsernameAndPassword implements Specification {

    private final String username;
    private final String password;

    public FindByUsernameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toSql() {
        return "Please specify username and password!";
    }

    @Override
    public List<Object> getParameters() {
        return Arrays.asList(username, password);
    }

}
