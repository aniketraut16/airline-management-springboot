package com.aniketraut16.airline.services;

import com.aniketraut16.airline.db.TicketInfo;
import com.aniketraut16.airline.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public TicketInfo getTicket(Long ticketId) {
        return ticketRepository.getTicket(ticketId);
    }

    public TicketInfo bookTicket(TicketInfo ticketDetails) {
        return ticketRepository.bookTicket(ticketDetails);
    }

    public boolean cancelTicket(Long ticketId) {
        return ticketRepository.cancelTicket(ticketId);
    }
}
