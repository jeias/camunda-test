package com.example.camunda.test.workflow.config;

import com.example.camunda.lib.workflow.config.WorkflowLibConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WorkflowLibConfig.class)
public class WorkflowConfig {
}
