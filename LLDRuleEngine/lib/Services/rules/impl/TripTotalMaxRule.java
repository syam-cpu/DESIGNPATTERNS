package LLDRuleEngine.lib.Services.rules.impl;

import java.lang.classfile.ClassFile.Option;
import java.util.List;
import java.util.Optional;

import LLDRuleEngine.lib.Services.rules.ExpenseRule;
import LLDRuleEngine.lib.Services.rules.TripRule;
import LLDRuleEngine.lib.Services.rules.Violation;
import LLDRuleEngine.lib.models.Expense;
import LLDRuleEngine.lib.utils.ExpenseUtils;

public class TripTotalMaxRule implements TripRule{

    private final double maxAmount;
   
    public TripTotalMaxRule(double maxAmount)
    {
        this.maxAmount = maxAmount;
    }

    @Override
    public Optional<Violation> check(List<Expense> expenses) {

        if (!ExpenseUtils.areAllExpenseOfSameTrip(expenses))
        {
            return Optional.of(Violation.of("Expenses are not of same trip"));
        }
        double total = 0;
        for (Expense expense : expenses)
        {
            total += expense.getAmountUsd();
        }
        if (total > maxAmount)
        {
            return Optional.of(Violation.of("Trip total exceeds the maximum amount"));
        }

        return Optional.empty();
    }
}
