package com.example.jouranalApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/journals") // Base path
public class JournalController {

    @GetMapping // GET /api/journals
    public String getAllJournals() {
        return "List of journals";
    }

    @PostMapping // POST /api/journals
    public String createJournal() {
        return "Journal created";
    }

    @PutMapping("/{id}") // PUT /api/journals/{id}
    public String updateJournal(@PathVariable String id) {
        return "Journal with ID " + id + " updated";
    }

    @DeleteMapping("/{id}") // DELETE /api/journals/{id}
    public String deleteJournal(@PathVariable String id) {
        return "Journal with ID " + id + " deleted";
    }
}
