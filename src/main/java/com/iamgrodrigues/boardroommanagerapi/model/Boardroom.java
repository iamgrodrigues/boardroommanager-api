package com.iamgrodrigues.boardroommanagerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="boardroom")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Boardroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String starHour;

    @Column(nullable = false)
    private String endHour;
}

