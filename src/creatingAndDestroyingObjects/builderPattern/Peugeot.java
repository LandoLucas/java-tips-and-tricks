package creatingAndDestroyingObjects.builderPattern;

import java.util.Objects;

public class Peugeot extends Car {

    private int yearOfFabrication;
    
    public Peugeot(Builder builder) {
      super(builder);
      this.yearOfFabrication = builder.yearOfFabrication;
    }
    
    public static class Builder extends Car.Builder<Builder> {

        private final int yearOfFabrication;
        
        public Builder(int year) {
            yearOfFabrication = Objects.requireNonNull(year);
        }
        
        @Override
        Peugeot build() {
            return new Peugeot(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
        
    }
    
}
