package it.unisa;

public class ArrayMax extends Thread {

	public static int max;
	public static int[] data;
	public static final int SIZE = 60000;
	public static final int MAX_THR = 6;
	
	private int start, finish;
	
	public ArrayMax(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}
	
	public void run() {
		for(int i = start; i < start + finish; i++) 
			if(max < data[i]) max = data[i];
	}
	
	public static void main(String[] args) {
		
		long begin, end;
		ArrayMax[] threads;
		data = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			data[i] = i;
		}	
		
		for(int numThread = 1; numThread <= MAX_THR; numThread += (numThread == 1) ? 1 : 2) {
			threads = new ArrayMax[numThread];
			max = data[0];
			int start = 0;
			begin = System.currentTimeMillis();
			for(int i = 0; i < numThread; i++) {
				threads[i] = new ArrayMax(start, SIZE / numThread);
				start += SIZE / numThread;
				threads[i].start();
			}
			for(ArrayMax t : threads) {
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			end = System.currentTimeMillis();
			System.out.println(numThread + " Thread(s): " + (end - begin) + " ms - Max: " + max);
			
		}
		
	}
	
}
