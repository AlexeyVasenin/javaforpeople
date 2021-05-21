package ru.vasenin.javaforpeople.Interface;

import org.springframework.core.Ordered;

public interface StringModifer extends Ordered {
    public String modify(String source);

}
