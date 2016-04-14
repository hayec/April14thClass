package theadPool7;

public class App 
{
	public static void main(String[] args) 
	{
//		Processor process = new Processor(5);
//		process.run();
		Thread t1 = new Thread(new Processor(1));//Allows to be run at runtime
		t1.start();
		Thread t2 = new Thread(new Processor(2));//Allows to be run at runtime
		t2.start();
		Thread t3 = new Thread(new Processor(3));//Allows to be run at runtime
		t3.start();
		Thread t4 = new Thread(new Processor(4));//Allows to be run at runtime
		t4.start();
		Thread t5 = new Thread(new Processor(5));//Allows to be run at runtime
		t5.start();
	}
}

