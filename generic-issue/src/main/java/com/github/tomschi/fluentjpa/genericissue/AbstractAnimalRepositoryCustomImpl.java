package com.github.tomschi.fluentjpa.genericissue;

import co.streamx.fluent.JPA.FluentJPA;
import co.streamx.fluent.JPA.FluentQuery;
import co.streamx.fluent.JPA.repository.EntityManagerSupplierImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static co.streamx.fluent.SQL.SQL.FROM;
import static co.streamx.fluent.SQL.SQL.SELECT;

public abstract class AbstractAnimalRepositoryCustomImpl<T extends AbstractAnimal> extends EntityManagerSupplierImpl implements AbstractAnimalRepositoryCustom<T> {

    @Override
    public List<T> getByName(String name) {
        FluentQuery query = FluentJPA.SQL((T animal) -> {
            SELECT(animal);
            FROM(animal);
        });

        Stream<?> stream = query.createQuery(getEntityManager()).getResultStream();
        return stream.map(x -> (T) x)
                .collect(Collectors.toList());
    }

}
