package com.camunda.demo.Day2Demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class workerClass implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String entry = (String) execution.getVariable("mapEntry");
		
		System.out.println(entry);
		
		Thread.sleep(2000);

	}

}
