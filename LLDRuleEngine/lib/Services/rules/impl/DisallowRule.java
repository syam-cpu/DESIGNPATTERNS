package LLDRuleEngine.lib.Services.rules.impl;

import java.util.Optional;

import LLDRuleEngine.lib.Services.rules.ExpenseRule;
import LLDRuleEngine.lib.Services.rules.Violation;
import LLDRuleEngine.lib.models.Expense;

public class DisallowRule implements ExpenseRule{

    @Override
    public Optional<Violation> check(Expense e) {
        // TODO Auto-generated method stub
        return Optional.of(Violation.of("Expense type " + e.getExpenseType() + "id:" + e.getExpenseId() + "is not allowed" ));
    }

    
    
}
