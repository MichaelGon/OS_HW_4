package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        taskManager.addTask("Build a To-Do App");

        List<Task> tasks = taskManager.getTasks();
        assertEquals(2, tasks.size());
        assertEquals("Learn Java", tasks.get(0).getName());
        assertEquals("Build a To-Do App", tasks.get(1).getName());
    }

    @Test
    public void testCompleteTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        
        taskManager.completeTask(0);
        
        assertEquals(true, taskManager.getTasks().get(0).isCompleted());
    }
}