package task_4.specification.user;

import task_4.entity.Role;
import task_4.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindByRole implements Specification {

    private final Role role;

    public FindByRole(Role role) {
        this.role = role;
    }

    @Override
    public String toSql() {
        return "Please specify the role!";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(role);
    }
}
