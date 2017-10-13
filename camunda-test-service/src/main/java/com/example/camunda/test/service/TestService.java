package com.example.camunda.test.service;

import com.example.camunda.lib.workflow.enums.WorkflowVariableKey;
import com.example.camunda.lib.workflow.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TestService {

    private WorkflowService workflowService;

    @Autowired
    public TestService(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    public void start(String content){

        HashMap<String, Object> variables = new HashMap<String, Object>();
        variables.put(WorkflowVariableKey.CONTENT.name(), content);
        workflowService.start("twitter-procces", System.currentTimeMillis()+"", variables);
    }
}
