package com.example.springboottutorial;

//import org.springframework.format.Formatter;

import org.springframework.stereotype.Component;

//@FormatterType("Bar")
@FormatterType(value = "Bar")
@Component
public class BarFormatter implements Formatter {
    public String format() {
        return "bar";
    }
}
