package ru.qulix.application.model.dao;

public class ColumnName {

    //PROJECTS
    private static final String PROJECT = "projects.";

    public static final String PROJECT_ID = PROJECT + "id";
    public static final String PROJECT_NAME = PROJECT + "name";
    public static final String PROJECT_SHORT = PROJECT + "shortName";
    public static final String DESCRIPTION = PROJECT + "description";

    //TASKS
    private static final String TASK = "tasks.";

    public static final String TASK_ID = TASK + "id";
    public static final String TASK_NAME = TASK + "name";
    public static final String DURATION = TASK + "dur";
    public static final String START = TASK + "start_date";
    public static final String END = TASK + "end_date";
    public static final String STATUS = TASK + "status";
}
