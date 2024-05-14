package com.example.springboottutorial;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class ScopeTesting {
    @Override
    public String toString() {
        return super.toString();
    }
}
