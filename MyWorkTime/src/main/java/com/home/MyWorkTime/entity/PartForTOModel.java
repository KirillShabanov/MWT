package com.home.MyWorkTime.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="part")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class PartForTOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String partNumber;
    private String partName;
    private Double partPrice;
}
