package creatingAndDestroyingObjects.parameterValidation;

import java.util.Objects;

public class Person {

    private int age;
    
    public Person(int age) {
        this.age = Objects.requireNonNull(age, "Age cannot be null!");
    }
    
    
}
