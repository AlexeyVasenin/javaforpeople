package ru.vasenin.javaforpeople;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {

    @Bean
    public String modify1(String line) {
        String toLowerLine = line.toLowerCase();
        return toLowerLine;
    }

    @Bean
    public String modify2(String line) {
        return line.charAt(line.length() - 1) + line.substring(0,
                line.length() - 1);
    }

    @Bean
    public String modify3(String line) {
        String toUpperChar =
                Character.toUpperCase(line.charAt(0))+line.substring(1);
        return  toUpperChar;
    }
}
