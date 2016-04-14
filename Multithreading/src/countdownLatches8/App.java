package countdownLatches8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App 
{
	public static void main(String[] args) throws InterruptedException
	{
		CountDownLatch latch = new CountDownLatch(5);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i = 1; i <= 5; i++)
		{
			executor.submit(new Processor(latch));
		}
		latch.await();
		System.out.println("Done!");
	}
}
