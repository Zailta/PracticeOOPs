package MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {
        // creating the object of Counter class
        Counter object = new Counter();
       // Creating class treads
        ThreadClass1 t1 = new ThreadClass1(object);
        ThreadClass2 t2 = new ThreadClass2(object);
        t2.start();
        t1.start();
    }

}
