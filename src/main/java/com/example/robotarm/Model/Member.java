package com.example.robotarm.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {

    private int user_id;

    private String user_name;
    private String user_password;
    private String user_email;

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
