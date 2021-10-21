
package abstractclasses;

public class parrot extends bird {
    
    public parrot(String name) {
        super(name);
    }
    
    @Override
    public void fly(){
        System.out.println("Parrots can fly anywhere between 50 to 100 miles a day, stopping for rests along the way");
    }
    
}
