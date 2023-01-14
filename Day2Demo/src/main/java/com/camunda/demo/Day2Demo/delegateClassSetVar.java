package com.camunda.demo.Day2Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import utilityDemo.fetchVar;
import utilityDemo.printMsg;

public class delegateClassSetVar implements JavaDelegate {
	
	public int temp=0;
	
	public static int tempS=0;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
	
	fetchVar.printVar();	
	fetchVar.var = 10;
	fetchVar.printVar();
	
	System.out.println("SetVarClass temp = "+temp);
	
	System.out.println("SetVarClass tempS = "+tempS);
	
	List<String> tempMap = new ArrayList<String>();
	
	tempMap.add("one");
	tempMap.add("two");
	tempMap.add("three");
	tempMap.add("four");
	tempMap.add("five");
	
	execution.setVariable("tempMap",tempMap);
	
	ExecutorService pool = Executors.newFixedThreadPool(3);
	 int counter = 0;
	
	for(String s : tempMap) {
		
		pool.execute(new work(s,counter));
		counter++;
	}
	
	
	pool.shutdown();
	
	 while(!pool.isTerminated()) {
		 System.out.println("waiting for work to comp");
		 Thread.sleep(1000);
	 }
	
	System.out.println("execution completed");
	

	
	}

}
