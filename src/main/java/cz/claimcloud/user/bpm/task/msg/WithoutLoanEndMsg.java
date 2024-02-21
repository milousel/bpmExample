package cz.claimcloud.user.bpm.task.msg;

import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
public class WithoutLoanEndMsg implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        delegateExecution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("withoutLoanEndMsg")
                .processInstanceBusinessKey(delegateExecution.getProcessBusinessKey()).correlate();

    }
}
