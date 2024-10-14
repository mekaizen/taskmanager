package com.task.manager.service;

import com.task.manager.entities.TaskEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TaskService {

    private ArrayList<TaskEntity> taks = new ArrayList<>();

    private int taskId =1;



}
