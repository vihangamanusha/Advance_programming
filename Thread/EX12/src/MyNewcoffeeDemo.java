import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyNewcoffeeDemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor=new ScheduledThreadPoolExecutor(10);

        CoffeeEvent coffee=new CoffeeEvent("Adding Coffee");
        CoffeeEvent sugar=new CoffeeEvent("Adding Sugar");
        CoffeeEvent water=new CoffeeEvent("Adding Water");
        CoffeeEvent serves=new CoffeeEvent("Adding Serves");

        for (int i = 0; i < 20; i++) {
            executor.schedule(new MyTimer(i),i, TimeUnit.SECONDS);
        }
        executor.schedule(coffee,4,TimeUnit.SECONDS);
        executor.schedule(sugar,7,TimeUnit.SECONDS);
        executor.schedule(water,10,TimeUnit.SECONDS);
        executor.schedule(serves,20,TimeUnit.SECONDS);
        executor.shutdown();

    }
}
