
//In an abstract class we are defining methods which are needed, but not writing how they are to be performed. This makes sure the subclasses implement the methods.
// - Not all methods need to be abstract, some can be implemented (can't do that with interfaces)
// - Abstract classes can have a constructor, interfaces can't
// - Abstract classes can have variables which can be inherited (can't do that with interfaces)
// - You can have private/protected or public variables/methods (interfaces only have public methods)

package abstractclasses;

public abstract class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void eat();
    
    public abstract void excersise();
}
