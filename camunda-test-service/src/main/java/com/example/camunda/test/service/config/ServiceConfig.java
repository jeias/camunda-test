package com.example.camunda.test.service.config;

import com.example.camunda.test.workflow.config.WorkflowConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WorkflowConfig.class)
public class ServiceConfig {
}
