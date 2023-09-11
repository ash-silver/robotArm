package com.example.robotarm.dto;


import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class MemberResponse {
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
