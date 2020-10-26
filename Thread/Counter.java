package it.unisa;

public class Counter extends Thread {

	public static int c;
	
	private void incrementa() { synchronized(Class.class) { c++; } }
		
	public void run() {
		for(int i = 0; i < 10000; i++)
			incrementa(); 
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		c = 0;
		Counter thread_1 = new Counter();
		Counter thread_2 = new Counter();
		
		thread_1.start();
		thread_2.start();
		
		thread_1.join();
		thread_2.join();
		
		System.out.println("Value of c: " + c);
		
	}
	
}
