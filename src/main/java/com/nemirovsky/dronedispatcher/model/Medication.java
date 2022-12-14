package com.nemirovsky.dronedispatcher.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Medication {
    @Id
    private String code;
    private String name;
    private Integer weight;
}