package ru.vasenin.javaforpeople.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vasenin.javaforpeople.Interface.StringModifer;

import java.util.List;


@Service
public class DataService {

    @Autowired
    List<StringModifer> stringModifers;

    public String getLine(String source) {

        for (int i = 0; i < 2; i++) {
            for (StringModifer bean : stringModifers) {
                source = bean.modify(source);
            }
        }
        return source;
    }
}


