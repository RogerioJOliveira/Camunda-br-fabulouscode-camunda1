package br.fabulous.code.camunda1.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("HelloDelegate")
public class HelloDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // TODO Auto-generated method stub

        String var = (String) execution.getVariable("nome");
      
        execution.setVariable("nome", "Hello" + " " + var); 
    }
    
}