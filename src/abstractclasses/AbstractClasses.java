
package abstractclasses;

//See animal and can fly classes for comments

public class AbstractClasses {

    public static void main(String[] args) {
        cat newCat = new cat("Mittens");
        newCat.excersise();
        
        bird newbird = new parrot("Joey");
        newbird.eat();
        newbird.fly();
        
        bat newBat = new bat("Shadow");
        newBat.fly();
    }
    
}
