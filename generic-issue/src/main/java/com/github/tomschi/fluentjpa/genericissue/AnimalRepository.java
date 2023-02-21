package com.github.tomschi.fluentjpa.genericissue;

import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends AbstractAnimalRepository<Animal, Long>, AnimalRepositoryCustom {
}
