package com.spring.sql.springmysql.dao;

import org.springframework.data.repository.CrudRepository;
import com.spring.sql.springmysql.model.Ticket;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface TicketDao extends CrudRepository<Ticket, Integer>{
}
