package ru.qulix.application.model.dao;

public class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();

    private DaoFactory() {
    }

    private final ProjectDAO projectDAO;
    private final TaskDAO taskDAO;

    public static DaoFactory getInstance() {
        return instance;
    }

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }

    public TaskDAO getTaskDAO() {
        return taskDAO;
    }
}
