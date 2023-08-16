package com.example.robotarm.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name="user")
public class Member {
    @Id
    private Long user_password;

    private int company_id;
    private int user_robot1;
    private int user_robot2;
    private int user_robot3;
    private int user_robot4;
    private int user_robot5;

    private int user_favorites1;
    private int user_favorites2;
    private int user_favorites3;
    private LocalDateTime user_join_at = LocalDateTime.now();
    private int user_edit_at;
    private int secession_at;



}
