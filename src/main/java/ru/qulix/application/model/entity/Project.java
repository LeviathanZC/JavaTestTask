package ru.qulix.application.model.entity;

import java.util.Objects;

public class Project extends Identifiable{

    private String name;
    private String shortName;
    private String description;

    public Project() {}

    public Project(String name, String shortName, String description) {
        this.name = name;
        this.shortName = shortName;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Project project = (Project) o;
        return Objects.equals(name, project.name) &&
                Objects.equals(shortName, project.shortName) &&
                Objects.equals(description, project.description);
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        result = prime * result + (getName()!= null ? getName().hashCode() : 0);
        result = prime * result + (getShortName() != null ? getShortName().hashCode() : 0);
        result = prime * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
