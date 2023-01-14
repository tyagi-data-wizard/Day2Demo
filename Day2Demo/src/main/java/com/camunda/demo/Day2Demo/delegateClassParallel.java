package com.camunda.demo.Day2Demo;

import java.time.LocalDateTime;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


import utilityDemo.fileGenP;
import utilityDemo.printMsg;
import utilityDemo.fetchVar;

public class delegateClassParallel implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println("---------------Parallel delegate class called----------------"+LocalDateTime.now());
		
		printMsg obj1 = new printMsg();
		 
		obj1.printUs("welcome bro");
		
		printMsg.print();
		
		fileGenP.create();
		
		
		fetchVar.printVar();
		fetchVar.var = 23;
		fetchVar.printVar();
		
		
		
		delegateClassSetVar t = new delegateClassSetVar();
		t.temp = 266;
		System.out.println("DelegateClassParallel temp = "+t.temp);
		
		delegateClassSetVar.tempS = 45;
		System.out.println("DelegateClassParallel tempS = "+delegateClassSetVar.tempS);
		
		

		System.out.println("delegateCLassParallel completed");

}
}
