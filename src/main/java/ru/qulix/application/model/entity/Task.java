package ru.qulix.application.model.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Task extends Identifiable {

    private String name;
    private int duration;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status status;

    public Task() {}

    public Task(String name, int duration, LocalDate start, LocalDate end, Status status) {
        this.name = name;
        this.duration = duration;
        this.startDate = start;
        this.endDate = end;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) return false;
        Task task = (Task) o;
        return duration == task.duration &&
                Objects.equals(name, task.name) &&
                Objects.equals(startDate, task.startDate) &&
                Objects.equals(endDate, task.endDate) &&
                status == task.status;
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        result = prime * result + (getName() != null ? getName().hashCode() : 0);
        result = prime * result + getDuration();
        result = prime * result + (getStartDate() != null ? getStartDate().hashCode() : 0);
        result = prime * result + (getEndDate() != null ? getEndDate().hashCode() : 0);
        result = prime * result + (getStatus() != null ? getStatus().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                '}';
    }
}
