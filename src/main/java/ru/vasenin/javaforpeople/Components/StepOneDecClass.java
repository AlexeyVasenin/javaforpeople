package ru.vasenin.javaforpeople.Components;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.vasenin.javaforpeople.Interface.StringModifer;

@Component
@Order(1)
public class StepOneDecClass implements StringModifer {

    @Override
    public String modify(String source) {

        return source.toLowerCase();

    }

    @Override
    public int getOrder() {
        return 1;
    }
}