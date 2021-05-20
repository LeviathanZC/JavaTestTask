package ru.qulix.application.model.creator;

import ru.qulix.application.model.entity.Status;
import ru.qulix.application.model.entity.Task;

import java.time.LocalDate;

public class TaskCreator {

    private static class TaskCreatorHolder {
        public static final TaskCreator INSTANCE = new TaskCreator();
    }

    private TaskCreator() {
    }


    public Task create(String id, String name, String dur, String start, String end, String status) {
        Task newTask = new Task();
        newTask.setId(Long.parseLong(id));
        newTask.setName(name);
        newTask.setDuration(Integer.parseInt(dur));
        newTask.setStatus(Status.valueOf(status));
        newTask.setStartDate(LocalDate.parse(start));
        newTask.setEndDate(LocalDate.parse(end));
        return newTask;
    }
}
