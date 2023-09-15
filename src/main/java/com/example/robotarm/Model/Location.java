package com.example.robotarm.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private int loaction_id;
    private int robot_id;
    private int location_first;
    private int location_second;
    private int location_third;
    private int location_fourth;
    private int location_fifth;
    private int location_sixth;

}
