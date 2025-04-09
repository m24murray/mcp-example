package com.example.demo.controller;

import com.example.demo.service.JiraService;
import com.example.demo.model.JiraTicket;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JiraController {

    private final JiraService jiraService;

    @GetMapping("/jira")
    public ResponseEntity<List<JiraTicket>> getAllJiraTickets() {
        List<JiraTicket> tickets = jiraService.getTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);

    }

    @GetMapping("/jira/{id}")
    public ResponseEntity<JiraTicket> getJiraTicket(@PathVariable String id) {
        JiraTicket ticket = jiraService.getTicketById(id);
        if (ticket != null) {
            return new ResponseEntity<>(ticket, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
