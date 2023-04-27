package com.ioanyt.hrm.leave.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document("holiday")
public class Holidays {

    @Id
    private Long id;
    private String name;
    private Date date;
    private int year;
    private int month;
    private int day;
}
