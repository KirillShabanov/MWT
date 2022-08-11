package com.home.MyWorkTime.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="to_regulations")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class SelectForTOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer FK_numTO;
    private Integer FK_autoTO;
    private Integer FK_partNumberTO;
    private Double amount;
    private Integer FK_jobCodeTO;
}
