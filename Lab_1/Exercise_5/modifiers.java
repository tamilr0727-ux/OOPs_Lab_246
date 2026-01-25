public class modifiers{
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;      
    private int privateVar = 40;

    public void showInsideClass() {
        System.out.println("Inside same class:");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
    public static void main(String[] args) {
        modifiers obj = new modifiers();
        obj.showInsideClass();
        System.out.println("\nSame class access from main:");
        System.out.println(obj.publicVar);     
        System.out.println(obj.protectedVar);  
        System.out.println(obj.defaultVar);    
    }
}

class SamePackageClass {
    void testAccess() {
        modifiers obj = new modifiers();

        System.out.println("\nSame package class:");
        System.out.println(obj.publicVar);     
        System.out.println(obj.protectedVar);  
        System.out.println(obj.defaultVar);
    }
}

class ChildClass extends modifiers {
    void testAccess() {
        System.out.println("\nSubclass access:");
        System.out.println(publicVar);     
        System.out.println(protectedVar);  
    }
}


