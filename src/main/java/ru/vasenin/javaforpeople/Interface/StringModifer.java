package ru.vasenin.javaforpeople.Interface;

import org.springframework.core.Ordered;

public interface StringModifer extends Ordered {
   String modify(String source);

}
