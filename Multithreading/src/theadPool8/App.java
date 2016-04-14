package theadPool8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) throws InterruptedException 
	{
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i = 1; i <= 5; i++)
		{
			executor.submit(new theadPool7.Processor(i));
		}
		executor.shutdown();
		Thread.sleep(5);
		System.out.println("All tasks submitted.");
		try
		{
			executor.awaitTermination(1, TimeUnit.SECONDS);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("All tasks completed.");
	}
}
