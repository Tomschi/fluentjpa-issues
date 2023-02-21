package com.github.tomschi.fluentjpa.genericissue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractAnimalRepository<T extends AbstractAnimal, ID> extends JpaRepository<T, ID>, AbstractAnimalRepositoryCustom<T> {
}
