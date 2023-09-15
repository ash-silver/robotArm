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
public class Robot {
    private int robot_id;
    private int user_id;
    private LocalDateTime robot_start_date;

    private LocalDateTime robot_end_date;
}
