package com.spring.sql.springmysql.controller;

import com.spring.sql.springmysql.dao.TicketDao;
import com.spring.sql.springmysql.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketDao dao;
    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Ticket> tickets){
        dao.saveAll(tickets);
        return  ("tickets booked: " + tickets.size());
    }
    @GetMapping("/getTickets")
    public List<Ticket> getTickets(){
        return ((List<Ticket>)dao.findAll());
    }

    @GetMapping("/testApi")
    public String getString(){
        return "yes running";
    }
}
