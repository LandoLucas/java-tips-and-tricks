package creatingAndDestroyingObjects.builderPattern;

import java.util.Objects;

public abstract class Car {

    static String brand;
    static String model;
    
    public Car(Builder<?> builder) {
        brand = builder.brand;
        model = builder.model;
    }
    
    abstract static class Builder<T extends Builder<T>>{
        
        String brand;
        String model;
        
        public T withBrand(String aBrand) {
            brand = Objects.requireNonNull(aBrand, "Car Brand is mandatory");
            return self();
        }
        
        public T withModel(String model) {
            model = Objects.requireNonNull(model, "Car Model is mandatory");
            return self();
        }

        abstract Car build();
        
        protected abstract T self();
    }
    
    
    
}
