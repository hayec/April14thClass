package countdownLatches8;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable 
{
	private CountDownLatch latch;
	public Processor(CountDownLatch latch)
	{
		this.latch = latch;
	}
	@Override
	public void run()
	{
		System.out.println("Starting : ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed.");
		latch.countDown();
	}
}
