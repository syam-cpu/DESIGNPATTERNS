package LLDRuleEngine.lib.rules.impl;

import java.util.Optional;

import LLDRuleEngine.lib.models.Expense;
import LLDRuleEngine.lib.rules.ExpenseRule;
import LLDRuleEngine.lib.rules.Violation;

public class DisallowRule implements ExpenseRule{

    @Override
    public Optional<Violation> check(Expense e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'check'");
    }
    
}
