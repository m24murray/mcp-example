package com.example.demo.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class JiraTicket {
    private String id;
    private String title;
    private String description;
    private String status;
    private String assignee;
    private String reporter;
    private LocalDateTime created;
    private LocalDateTime updated;
    private List<String> acceptanceCriteria;
    private String priority;
    private String type;
}
