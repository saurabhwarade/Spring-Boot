package org.example.springbootjdbc.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course {
    private int id;
    private String course_Name;
    private int Price;
}
