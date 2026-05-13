package LLDRuleEngine.lib.Services.rules.impl;

import java.util.Optional;

import LLDRuleEngine.lib.Services.rules.ExpenseRule;
import LLDRuleEngine.lib.Services.rules.Violation;
import LLDRuleEngine.lib.models.Expense;

public class MaxAmountRule implements ExpenseRule {

    private final double maxAmount;

    public MaxAmountRule(double maxAmount)
    {
        this.maxAmount = maxAmount;
    }

    @Override
    public Optional<Violation> check(Expense e) {
        
        if (e.getAmountUsd() > maxAmount)
        {
            return Optional.of(Violation.of("Expense amount is greater than the max amount"));
        }

        return Optional.empty();
    }
}
