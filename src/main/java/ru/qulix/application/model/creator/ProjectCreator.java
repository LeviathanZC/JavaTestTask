package ru.qulix.application.model.creator;

import ru.qulix.application.model.entity.Project;

public class ProjectCreator {

    private static class ProjectCreatorHolder {
        public static final ProjectCreator INSTANCE = new ProjectCreator();
    }

    private ProjectCreator() {}

    public static ProjectCreator getCreator() {
        return ProjectCreatorHolder.INSTANCE;
    }

    public Project create(String id, String name, String shortName, String description) {
        Project newProject = new Project(name, shortName, description);
        newProject.setId(Long.parseLong(id));
        return newProject;
    }
}
