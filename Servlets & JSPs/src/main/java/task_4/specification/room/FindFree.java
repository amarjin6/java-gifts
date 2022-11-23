package task_4.specification.room;

import task_4.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindFree implements Specification {

    public FindFree() {
    }

    @Override
    public String toSql() {
        return "Please specify room to occupy!";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
