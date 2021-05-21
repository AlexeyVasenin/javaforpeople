package ru.vasenin.javaforpeople.Components;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.vasenin.javaforpeople.Interface.StringModifer;

@Component
@Order(2)
public class SecondClass implements StringModifer {


    @Override
    public String modify(String source) {
        return source.charAt(source.length() - 1) + source.substring(0,
                source.length() - 1);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}