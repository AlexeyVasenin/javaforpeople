package ru.vasenin.javaforpeople.Components;

import javafx.util.Pair;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.vasenin.javaforpeople.Interface.StringModifer;

import java.util.HashMap;
import java.util.Map;

@Component
@Order(4)
public class FourClass implements StringModifer {

    public Map<String, String> alphabet() {
        Map<String, String> result = new HashMap<>();

        result.put("в", "д");
        result.put("о", "л");
        result.put("к", "ю");
        result.put("%", " ");
        result.put("~", "я");
        result.put("Ж", "J");
        result.put("п", "v");

        return result;
    }

    @Override
    public String modify(String source) {
        Map<String, String> alphaClone = alphabet();
        for (String oneChar : alphaClone.keySet()){
           source = source.replace(oneChar,alphaClone.get(oneChar));
        }

        return source;
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
