package com.github.tomschi.fluentjpa.genericissue;

import co.streamx.fluent.JPA.repository.EntityManagerSupplier;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface AbstractAnimalRepositoryCustom<T extends AbstractAnimal> extends EntityManagerSupplier {

    List<T> getByName(String name);

}
