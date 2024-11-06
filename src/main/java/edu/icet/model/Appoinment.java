package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Appoinment {
    private Integer id;
    private String type;
    private String qr;
    private LocalDate dateAndTime;
    private String description;
    private String status;
    private Integer roomNumber;
    private Integer q_Number;

    private Integer patientId;
    private Integer adminId;
}
