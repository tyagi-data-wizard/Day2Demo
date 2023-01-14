package com.camunda.demo.Day2Demo;

public class work implements Runnable {
	
	private String id;
	private int threadNumber;
	
	public work(String id, int threadNumber) {
		this.id = id;
		this.threadNumber = threadNumber;
	}

	
	@Override
	public void run() {
		int counter =0;
		while(true) {
		//System.out.print("id = "+id +" Thread number = "+ threadNumber);
			System.out.println("id = "+id +" Current Thread Name: " + Thread.currentThread().getName()+" Current Thread ID: "
		            + Thread.currentThread().getId());
		counter++;
		
		if(counter>5) {
			break;
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		
	
		

	}

}
