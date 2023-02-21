package com.github.tomschi.fluentjpa.genericissue;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractAnimal {

    private String name;

}
