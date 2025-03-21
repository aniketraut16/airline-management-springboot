package com.aniketraut16.airline;

import com.aniketraut16.airline.db.TicketInfo;
import com.aniketraut16.airline.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping()
    public TicketInfo bookTicket(@RequestBody TicketInfo ticket) {
        return ticketService.bookTicket(ticket);
    }

    @GetMapping("/{id}")
    public TicketInfo getTicket(@PathVariable Long id) {
        return ticketService.getTicket(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> cancelTicket(@PathVariable Long id) {
        boolean response = ticketService.cancelTicket(id);

        Map<String, String> responseBody = new HashMap<>();
        if (response) {
            responseBody.put("message", "Ticket Canceled Successfully!");
            return ResponseEntity.ok(responseBody);
        } else {
            responseBody.put("message", "Invalid Ticket ID");
            return ResponseEntity.badRequest().body(responseBody);
        }
    }
}
