
package abstractclasses;


public class cat extends animal{
    
    public cat(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println("The cat eats fish or cat buscuits");
    }

    @Override
    public void excersise() {
        System.out.println("Cats need excersise and will need you to play with them throughout the day");
    }
    
}
