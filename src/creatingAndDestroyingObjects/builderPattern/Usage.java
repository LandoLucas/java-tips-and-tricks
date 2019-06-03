package creatingAndDestroyingObjects.builderPattern;

public class Usage {

    public void seeBuilderInAction() {
        
       Peugeot p = new Peugeot.Builder(2011).withBrand("Peugeot").withModel("207").build();
        
    }
    
}
