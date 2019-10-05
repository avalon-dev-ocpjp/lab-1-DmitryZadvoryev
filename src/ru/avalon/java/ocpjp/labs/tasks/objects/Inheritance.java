package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Задание, направленное на изучение следующих тем: 1. наследование; 2.
 * полиморфизм; 3. использование коллекции ArrayList
 */
public final class Inheritance implements Exercise {

    /**
     * Объект, выполняющий сравнение объектов типа {@link Citizen}.
     */
    private Comparator<Citizen> comparator;

    /**
     * Источник случайного набора экземпляров класса {@link Citizen}.
     * <p>
     * Объектов в источнике должно быть случайное количечство в диапазоне от
     * {@code 20} до {@code 30}.
     * <p>
     * Формировать экземпляры следует с использованием данных словарей,
     * расположенных в пакете {@link ru.avalon.java.ocpjp.labs.resources}.
     */
    private Iterable<Citizen> source;

    /**
     * Объект, отвечающий за вывод экземпляров {@link Citizen} в консоль.
     */
    private ObjectWriter<Citizen> writer;

    public Inheritance() {
        comparator = new CitizenComparator();
        source = RandomCitizenSource.getInstance(RandomCitizenFactory.getInstance());
        writer = new CitizenWriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        StreamSupport.stream(source.spliterator(), false)
                .sorted(comparator)
                .forEach(this::print);
    }

    public void print(Citizen citizen) {
        try {
            writer.write(citizen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
