package it.unisa;

public class ArraySum extends Thread {

	public static int sum;
	public static int[] data;
	public static final int SIZE = 60000;
	public static final int MAX_THR = 6;
	
	private int start, finish;
	
	public ArraySum(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}
	
	public void run() {
		synchronized(Class.class) { 
			for(int i = start; i < start + finish; i++)
				sum += data[i];
		}
	}
	
	public static void main(String[] args) {
		
		long begin, end;
		ArraySum[] threads;
		data = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			data[i] = i;
		}	
		
		for(int numThread = 1; numThread <= MAX_THR; numThread += (numThread == 1) ? 1 : 2) {
			threads = new ArraySum[numThread];
			sum = 0;
			int start = 0;
			begin = System.currentTimeMillis();
			for(int i = 0; i < numThread; i++) {
				threads[i] = new ArraySum(start, SIZE / numThread);
				start += SIZE / numThread;
				threads[i].start();
			}
			for(ArraySum t : threads) {
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			end = System.currentTimeMillis();
			System.out.println(numThread + " Thread(s): " + (end - begin) + " ms - Sum: " + sum);
			
		}
		
	}
	
}
