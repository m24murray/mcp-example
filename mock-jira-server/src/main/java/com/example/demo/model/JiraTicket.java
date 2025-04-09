package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

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

    public JiraTicket() {
    }

    public JiraTicket(String id, String title, String description, String status, String assignee,
                    String reporter, LocalDateTime created, LocalDateTime updated,
                    List<String> acceptanceCriteria, String priority, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.assignee = assignee;
        this.reporter = reporter;
        this.created = created;
        this.updated = updated;
        this.acceptanceCriteria = acceptanceCriteria;
        this.priority = priority;
        this.type = type;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public List<String> getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(List<String> acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
