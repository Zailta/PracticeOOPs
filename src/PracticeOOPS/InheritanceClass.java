package PracticeOOPS;

public class InheritanceClass {
   public int  a = 3;
   public void addfive(){
       a+=5;
       System.out.println("Base "+a);
   }
}
class ChildClass extends InheritanceClass{
    public int a = 8;
    public void addfive(){
        a+=5;
        System.out.println("Derived "+a);
    }
}
class Tester{
    public static void main(String[] args) {
        // ChildClass object = (ChildClass) new InheritanceClass(); cant do
        ChildClass object = new ChildClass();
        InheritanceClass inheritanceClass = new ChildClass(); // downcasting
        inheritanceClass.addfive();

        object.addfive();
        System.out.println(object.a);
    }
}
