package com.camunda.demo.Day2Demo;

import java.time.LocalDateTime;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import utilityDemo.fetchVar;
import utilityDemo.fileGen;
import utilityDemo.printMsg;




public class delegateClass implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
System.out.println("---------------Ddelegate class called----------------"+LocalDateTime.now());
		
		printMsg obj1 = new printMsg();
		 
		obj1.printUs("welcome bro");
		
		printMsg.print();
		
		fileGen.create();
		
		
		try {
			  Thread.sleep(10* 1000);
			} catch (InterruptedException ex) {
			  ex.printStackTrace();
			}
		
		
		fetchVar.printVar();
		fetchVar.var = 23;
		fetchVar.printVar();
		
		delegateClassSetVar t = new delegateClassSetVar();
		t.temp = 265;
		System.out.println("DelegateClass temp = "+t.temp);
		
		delegateClassSetVar.tempS = 44;
		System.out.println("DelegateClass tempS = "+delegateClassSetVar.tempS);
		
		

		System.out.println("delegateCLass completed");
		

}
}
