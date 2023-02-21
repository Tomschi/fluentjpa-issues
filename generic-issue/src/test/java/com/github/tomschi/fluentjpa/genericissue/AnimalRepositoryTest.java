package com.github.tomschi.fluentjpa.genericissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class AnimalRepositoryTest {

    @Autowired
    private AnimalRepository repository;

    @Test
    void test() {
        repository.getByName("Test");
    }

}