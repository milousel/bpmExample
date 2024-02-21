package cz.claimcloud.user.bpm.task.msg;

import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
public class GetLoanEndMsg implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int loan = (int) delegateExecution.getVariable("loan");

        delegateExecution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("getLoanEndMsg")
                .processInstanceBusinessKey(delegateExecution.getProcessBusinessKey())
                .setVariable("loan", loan)
                .correlate();
    }
}
