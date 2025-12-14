package com.lithium.lithium.entity;

import jakarta.persistence.*;

@Entity
public class UsageLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable=false)
    User user;

    @ManyToOne
    @JoinColumn(name="")
    Project project;

}
