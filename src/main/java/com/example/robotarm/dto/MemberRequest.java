package com.example.robotarm.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class MemberRequest {
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
