
//Assignment 2: Access Modifiers in Packages
package packtwo;

import packone.MyClass;

public class OtherClass {
    public void accessMembers() {
        MyClass obj = new MyClass();
        System.out.println(obj.publicVar); // Accessible
        // System.out.println(obj.privateVar); // Compilation error
        // System.out.println(obj.protectedVar); // Compilation error
        // System.out.println(obj.defaultVar); // Compilation error

        obj.publicMethod(); // Accessible
        // obj.privateMethod(); // Compilation error
        // obj.protectedMethod(); // Compilation error
        // obj.defaultMethod(); // Compilation error
    }
}