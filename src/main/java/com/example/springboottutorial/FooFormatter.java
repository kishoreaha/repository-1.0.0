package com.example.springboottutorial;

//import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@FormatterType("Foo")
//@FormatterType(value = "fooooo")
@Component("fooFormat")
public class FooFormatter implements Formatter {

    @FormatterType(value = "CustomAnnotationAtVarLevelFooClass")
    public String format2 = "One";

    public String format() {
        return "foo";
    }
}
