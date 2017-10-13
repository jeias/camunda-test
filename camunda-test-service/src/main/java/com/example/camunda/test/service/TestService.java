package com.example.camunda.test.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private RuntimeService runtimeService;

    @Autowired
    public TestService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public void start(){
        runtimeService.startProcessInstanceByKey("jeias-process", System.currentTimeMillis()+"");
    }
}
