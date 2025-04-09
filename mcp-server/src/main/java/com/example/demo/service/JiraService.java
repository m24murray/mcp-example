package com.example.demo.service;

import com.example.demo.model.JiraTicket;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class JiraService {
    private final RestClient restClient;

    public JiraService() {
        this.restClient = RestClient.builder()
                .baseUrl("http://localhost:8080/jira")
                .defaultHeader("Accept", "application/json")
                .defaultHeader("User-Agent", "JiraApiClient/1.0 (matthewmu@kainos.com)")
                .build();
    }

    @Tool(description = "Get jira ticket for a specific id")
    public JiraTicket getJiraInfoById(
            String jiraId
    ) {
        return restClient.get()
                .uri("/{id}", jiraId)
                .retrieve()
                .body(JiraTicket.class);
    }

    @Tool(description = "Get all jira tickets")
    public List<?> getJiraInfo() {
        return restClient.get()
                .uri("")
                .retrieve()
                .body(List.class);
    }
}
