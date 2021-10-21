
package abstractclasses;


public class bat extends animal implements canFly{

    public bat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bbats like to eat beetles, moths, mosquitoes, and other insects");
    }

    @Override
    public void excersise() {
        System.out.println("Bats get plenty of excersise by flying around");
    }

    @Override
    public void fly() {
        System.out.println("Bats could be flying as far as 30-50 miles each night");
    }
    
}
