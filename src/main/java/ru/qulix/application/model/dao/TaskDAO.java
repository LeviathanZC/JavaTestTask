package ru.qulix.application.model.dao;

import ru.qulix.application.model.entity.Task;
import ru.qulix.application.model.exception.DaoException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TaskDAO {

    void add(Map<String, Object> taskParams) throws DaoException;

    void remove(long id) throws DaoException;

    void update(Map<String, Object> taskParams) throws DaoException;

    Optional<Task> findById(long id) throws DaoException;

    List<Task> findAll() throws DaoException;

}
