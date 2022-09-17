package test5;

import java.security.PublicKey;
import java.util.Objects;

public abstract class Person {
    public abstract String getDrection();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

