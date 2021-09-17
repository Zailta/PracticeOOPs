package MultiThreading;

public class ThreadClass1 extends Thread{
    @Override
    public void run(){
        int a = 100;
        a++;
        System.out.println(a);
    }
    private Counter counter;
    public ThreadClass1(Counter counter){
        this.counter = counter;
        this.counter.counter++;
        System.out.println(counter.counter);


    }
}
