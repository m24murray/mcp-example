package com.example.demo.service;

import com.example.demo.model.JiraTicket;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JiraService {

    private Map<String, JiraTicket> tickets = new HashMap<>();

    @PostConstruct
    public void init() {
        // Create mock Jira tickets

        // KNOS-123: Add user authentication API
        JiraTicket ticket1 = new JiraTicket(
                "KNOS-123",
                "Add user authentication API",
                "Implement REST API endpoints for user authentication including login, logout, and token refresh functionality.",
                "In Progress",
                "Jane Smith",
                "John Doe",
                LocalDateTime.of(2025, 3, 15, 9, 30),
                LocalDateTime.of(2025, 4, 1, 14, 45),
                Arrays.asList(
                        "AC1: Implementation of a POST /api/auth/login endpoint that accepts username and password and returns JWT token",
                        "AC2: Implementation of a POST /api/auth/logout endpoint that invalidates the current JWT token",
                        "AC3: Implementation of a POST /api/auth/refresh endpoint that accepts a refresh token and returns a new JWT token",
                        "AC4: All endpoints should return appropriate HTTP status codes (200, 400, 401, etc.)",
                        "AC5: Successful login should return user profile information along with the token",
                        "AC6: Authentication should be tested with at least 5 test cases",
                        "AC7: API documentation should be updated with the new endpoints"
                ),
                "High",
                "Feature"
        );

        // KNOS-456: Create dashboard UI components
        JiraTicket ticket2 = new JiraTicket(
                "KNOS-456",
                "Create dashboard UI components",
                "Design and implement UI components for the analytics dashboard, including charts, filters, and data tables.",
                "To Do",
                "Michael Chen",
                "Sarah Williams",
                LocalDateTime.of(2025, 3, 25, 11, 15),
                LocalDateTime.of(2025, 3, 25, 11, 15),
                Arrays.asList(
                        "AC1: Create reusable bar chart, line chart, and pie chart components",
                        "AC2: Implement dashboard filter component with date range, category, and status filters",
                        "AC3: Create responsive data table with sorting, pagination, and search functionality",
                        "AC4: Components should work on both desktop and mobile viewports",
                        "AC5: Implement skeleton loading states for components when data is being fetched",
                        "AC6: Create detailed technical documentation for each component",
                        "AC7: Ensure all components meet WCAG AA accessibility standards",
                        "AC8: Write unit tests for each component with at least 85% code coverage"
                ),
                "Medium",
                "Task"
        );

        // KNOS-789: Fix data export performance issue
        JiraTicket ticket3 = new JiraTicket(
                "KNOS-789",
                "Fix data export performance issue",
                "The data export functionality is taking too long for large datasets, causing timeout issues. Need to optimize the query and implement pagination for large exports.",
                "Backlog",
                "Unassigned",
                "Alex Johnson",
                LocalDateTime.of(2025, 3, 30, 16, 20),
                LocalDateTime.of(2025, 3, 30, 16, 20),
                Arrays.asList(
                        "AC1: Optimize database queries to reduce export time by at least 70%",
                        "AC2: Implement chunked processing for exports with more than 10,000 records",
                        "AC3: Add progress indicator for exports that shows percentage completion",
                        "AC4: Allow cancellation of in-progress exports",
                        "AC5: Add option for background processing with email notification when export is ready",
                        "AC6: Document performance improvements in the technical documentation",
                        "AC7: Create performance test suite to verify improvements"
                ),
                "Critical",
                "Bug"
        );

        // KNOS-1010: Implement user profile page
        JiraTicket ticket4 = new JiraTicket(
                "KNOS-1010",
                "Implement user profile page",
                "Create a user profile page where users can view and edit their personal information.",
                "To Do",
                "Alice Brown",
                "Bob White",
                LocalDateTime.of(2025, 4, 5, 10, 0),
                LocalDateTime.of(2025, 4, 5, 10, 0),
                Arrays.asList(
                        "AC1: Display user information including name, email, and profile picture",
                        "AC2: Allow users to update their information",
                        "AC3: Implement form validation for user inputs",
                        "AC4: Ensure the page is responsive",
                        "AC5: Write unit tests with at least 80% coverage"
                ),
                "High",
                "Feature"
        );

        // KNOS-1020: Add password reset functionality
        JiraTicket ticket5 = new JiraTicket(
                "KNOS-1020",
                "Add password reset functionality",
                "Implement a password reset feature that allows users to reset their password via email.",
                "In Progress",
                "Charlie Green",
                "David Black",
                LocalDateTime.of(2025, 4, 6, 11, 0),
                LocalDateTime.of(2025, 4, 6, 11, 0),
                Arrays.asList(
                        "AC1: Create a password reset request form",
                        "AC2: Send a password reset email with a unique token",
                        "AC3: Implement a password reset form that validates the token",
                        "AC4: Ensure the feature is secure against common vulnerabilities",
                        "AC5: Write integration tests for the password reset flow"
                ),
                "Medium",
                "Feature"
        );

        // KNOS-1030: Optimize database indexing
        JiraTicket ticket6 = new JiraTicket(
                "KNOS-1030",
                "Optimize database indexing",
                "Review and optimize database indexes to improve query performance.",
                "Backlog",
                "Eve Blue",
                "Frank Yellow",
                LocalDateTime.of(2025, 4, 7, 12, 0),
                LocalDateTime.of(2025, 4, 7, 12, 0),
                Arrays.asList(
                        "AC1: Identify slow queries and analyze their execution plans",
                        "AC2: Add or modify indexes to improve query performance",
                        "AC3: Ensure no negative impact on write performance",
                        "AC4: Document changes and their impact on performance",
                        "AC5: Write performance tests to verify improvements"
                ),
                "Critical",
                "Task"
        );

        // KNOS-1040: Refactor legacy codebase
        JiraTicket ticket7 = new JiraTicket(
                "KNOS-1040",
                "Refactor legacy codebase",
                "Refactor the legacy codebase to improve maintainability and readability.",
                "To Do",
                "Grace Red",
                "Hank Purple",
                LocalDateTime.of(2025, 4, 8, 13, 0),
                LocalDateTime.of(2025, 4, 8, 13, 0),
                Arrays.asList(
                        "AC1: Identify and refactor code smells",
                        "AC2: Ensure no changes in functionality",
                        "AC3: Improve code comments and documentation",
                        "AC4: Write unit tests for refactored code",
                        "AC5: Ensure code coverage remains above 90%"
                ),
                "High",
                "Task"
        );

        // KNOS-1050: Implement dark mode
        JiraTicket ticket8 = new JiraTicket(
                "KNOS-1050",
                "Implement dark mode",
                "Add a dark mode option to the application for better user experience in low-light environments.",
                "In Progress",
                "Ivy Orange",
                "Jack Pink",
                LocalDateTime.of(2025, 4, 9, 14, 0),
                LocalDateTime.of(2025, 4, 9, 14, 0),
                Arrays.asList(
                        "AC1: Create a toggle for dark mode in the user settings",
                        "AC2: Ensure all UI components support dark mode",
                        "AC3: Test dark mode on various devices and screen sizes",
                        "AC4: Write unit tests for dark mode functionality",
                        "AC5: Update documentation with dark mode instructions"
                ),
                "Medium",
                "Feature"
        );

        // KNOS-1060: Improve API error handling
        JiraTicket ticket9 = new JiraTicket(
                "KNOS-1060",
                "Improve API error handling",
                "Enhance the error handling in the API to provide more informative error messages.",
                "To Do",
                "Kevin Gray",
                "Laura White",
                LocalDateTime.of(2025, 4, 10, 15, 0),
                LocalDateTime.of(2025, 4, 10, 15, 0),
                Arrays.asList(
                        "AC1: Standardize error response format",
                        "AC2: Provide detailed error messages for common errors",
                        "AC3: Log errors with sufficient context for debugging",
                        "AC4: Ensure no sensitive information is exposed in error messages",
                        "AC5: Write tests to verify error handling improvements"
                ),
                "High",
                "Task"
        );

        // KNOS-1070: Add multi-language support
        JiraTicket ticket10 = new JiraTicket(
                "KNOS-1070",
                "Add multi-language support",
                "Implement support for multiple languages in the application.",
                "Backlog",
                "Megan Brown",
                "Nathan White",
                LocalDateTime.of(2025, 4, 11, 16, 0),
                LocalDateTime.of(2025, 4, 11, 16, 0),
                Arrays.asList(
                        "AC1: Identify key areas of the application for localization",
                        "AC2: Implement language selection in user settings",
                        "AC3: Translate application content into supported languages",
                        "AC4: Ensure proper encoding and display of different languages",
                        "AC5: Write tests to verify multi-language support"
                ),
                "Medium",
                "Feature"
        );

        // KNOS-1080: Enhance security logging
        JiraTicket ticket11 = new JiraTicket(
                "KNOS-1080",
                "Enhance security logging",
                "Improve security logging to capture more detailed information about security events.",
                "To Do",
                "Olivia Black",
                "Paul White",
                LocalDateTime.of(2025, 4, 12, 17, 0),
                LocalDateTime.of(2025, 4, 12, 17, 0),
                Arrays.asList(
                        "AC1: Log all authentication attempts with relevant details",
                        "AC2: Capture and log security-related configuration changes",
                        "AC3: Ensure logs are stored securely and access-controlled",
                        "AC4: Implement log rotation and retention policies",
                        "AC5: Write tests to verify security logging enhancements"
                ),
                "Critical",
                "Task"
        );

        // KNOS-1090: Implement caching for frequently accessed data
        JiraTicket ticket12 = new JiraTicket(
                "KNOS-1090",
                "Implement caching for frequently accessed data",
                "Add caching mechanisms to improve performance for frequently accessed data.",
                "In Progress",
                "Quincy Green",
                "Rachel White",
                LocalDateTime.of(2025, 4, 13, 18, 0),
                LocalDateTime.of(2025, 4, 13, 18, 0),
                Arrays.asList(
                        "AC1: Identify data that can benefit from caching",
                        "AC2: Implement caching using a suitable caching library",
                        "AC3: Ensure cache invalidation strategies are in place",
                        "AC4: Monitor cache performance and hit/miss ratios",
                        "AC5: Write tests to verify caching functionality"
                ),
                "High",
                "Feature"
        );

        // KNOS-1100: Redesign login page
        JiraTicket ticket13 = new JiraTicket(
                "KNOS-1100",
                "Redesign login page",
                "Redesign the login page to improve user experience and accessibility.",
                "To Do",
                "Steve Blue",
                "Tina White",
                LocalDateTime.of(2025, 4, 14, 19, 0),
                LocalDateTime.of(2025, 4, 14, 19, 0),
                Arrays.asList(
                        "AC1: Create a modern and user-friendly design",
                        "AC2: Ensure the page is fully accessible",
                        "AC3: Implement form validation and error messages",
                        "AC4: Test the page on various devices and screen sizes",
                        "AC5: Write unit tests for the login page"
                ),
                "Medium",
                "Task"
        );

        // Add tickets to map
        tickets.put(ticket1.getId(), ticket1);
        tickets.put(ticket2.getId(), ticket2);
        tickets.put(ticket3.getId(), ticket3);
        tickets.put(ticket4.getId(), ticket4);
        tickets.put(ticket5.getId(), ticket5);
        tickets.put(ticket6.getId(), ticket6);
        tickets.put(ticket7.getId(), ticket7);
        tickets.put(ticket8.getId(), ticket8);
        tickets.put(ticket9.getId(), ticket9);
        tickets.put(ticket10.getId(), ticket10);
        tickets.put(ticket11.getId(), ticket11);
        tickets.put(ticket12.getId(), ticket12);
        tickets.put(ticket13.getId(), ticket13);
    }

    public JiraTicket getTicketById(String id) {
        return tickets.get(id);
    }

    public List<JiraTicket> getTickets() {
        return tickets.values().stream().toList();
    }
}
