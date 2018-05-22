package com.drg0n20.springrecipeapp.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UnitOfMeasure uom;

    @OneToOne
    private Ingredient ingredient;
}
