package com.home.MyWorkTime.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="normalization")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class NormalizForTOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer jobCode;
    private String jobName;
    private Double jobTime;
    private Double priceTime;
}
