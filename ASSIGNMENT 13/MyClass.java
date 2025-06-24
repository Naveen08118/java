//Assignment 2: Access Modifiers in Packages

package packone;



public class MyClass {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar;

    public MyClass() {
        publicVar = 1;
        privateVar = 2;
        protectedVar = 3;
        defaultVar = 4;
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }
}