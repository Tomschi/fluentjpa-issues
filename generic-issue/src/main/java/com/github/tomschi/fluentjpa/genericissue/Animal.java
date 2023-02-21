package com.github.tomschi.fluentjpa.genericissue;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "animal")
public class Animal extends AbstractAnimal{

    @Id
    private Long id;

}
