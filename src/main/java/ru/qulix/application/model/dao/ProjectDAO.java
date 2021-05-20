package ru.qulix.application.model.dao;

import ru.qulix.application.model.entity.Project;
import ru.qulix.application.model.exception.DaoException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProjectDAO {

    void add(Map<String, Object> projParams) throws DaoException;

    void remove(long id) throws DaoException;

    void update(Map<String, Object> projParams) throws DaoException;

    Optional<Project> findById(long id) throws DaoException;

    List<Project> findAll() throws DaoException;
}
