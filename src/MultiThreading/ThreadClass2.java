package MultiThreading;

public class ThreadClass2 extends Thread {
    private Counter counter;
    public ThreadClass2(Counter counter){
        this.counter = counter;
        this.counter.counter++;
        System.out.println(counter.counter);
    }
    @Override
    public void run(){
        int a = 200;
        a++;
        System.out.println(a);
    }
}
