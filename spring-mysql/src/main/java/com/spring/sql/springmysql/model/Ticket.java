package com.spring.sql.springmysql.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Ticket")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    private String category;
}
