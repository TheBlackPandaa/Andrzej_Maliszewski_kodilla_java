package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("task list 1", "task list 1");
        //When
        taskListDao.save(taskList);
        //Then
        String name = taskList.getListName();
        List<TaskList> readTask = taskListDao.findByListName(name);
        assertEquals(1, readTask.size());
        //Cleanup
        int id = readTask.get(0).getId();
        taskListDao.deleteById(id);
    }
}
