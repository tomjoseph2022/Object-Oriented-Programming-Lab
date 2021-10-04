import java.util.*;
class Q
{
    int n;
    boolean statusFlag=false;
    synchronized void put(int n) //producer produce(put)
    {
        try{
            while(statusFlag){
                wait();
            }
        }

        catch(InterruptedException e){}
        this.n=n;
        System.out.println("put:"+n);
        statusFlag=true;
        notify();
    }

    synchronized int get()
    {
        try
        {
            while(!statusFlag)
            {
                wait();
            }
        }
        catch(InterruptedException e){}
        statusFlag=false;
        
        System.out.println("got:"+n);
        notify();
        return n;

    }
       
}

class producer implements Runnable
{
    Q q;
    producer(Q q)
    {
        this.q=q;
        new Thread(this,"producer").start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            q.put(i++);
        }
    }
}

class consumer implements Runnable
{
    Q q;
    consumer(Q q)
    {
        this.q=q;
        new Thread(this,"consumer").start();
    }
    public void run()
    {
        while(true)
        {
        q.get();
        }
    }
}

public class producerconsumer
{
public static void main(String[] args) {
    Q q=new Q();
    producer p=new producer(q);
    consumer c=new consumer(q);
}
}