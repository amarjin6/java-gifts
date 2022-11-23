package task_4.builder;

import task_4.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
