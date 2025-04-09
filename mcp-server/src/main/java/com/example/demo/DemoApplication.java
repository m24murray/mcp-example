package com.example.demo;

import com.example.demo.service.JiraService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider weatherTools(JiraService jiraService) {
        return  MethodToolCallbackProvider.builder().toolObjects(jiraService).build();
    }
}
