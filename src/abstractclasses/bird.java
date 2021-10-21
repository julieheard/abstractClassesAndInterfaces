
package abstractclasses;

public abstract class bird extends animal implements canFly {

    public bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" should eat worms, small insects, can eat bird balls made of seed");
    }

    @Override
    public void excersise() {
        System.out.println("You will not need to exerise, just make sure they can flap their wings and roam about");
    }

    
}
