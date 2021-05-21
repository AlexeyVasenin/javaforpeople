package ru.vasenin.javaforpeople.Components;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.vasenin.javaforpeople.Interface.StringModifer;

@Component
@Order(3)
public class StepThreeDecClass implements StringModifer {

    @Override
    public String modify(String source) {

        return Character.toUpperCase(source.charAt(0)) + source.substring(1);
    }

    @Override
    public int getOrder() {
        return 3;
    }
}