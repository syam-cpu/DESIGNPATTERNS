package LLDRuleEngine.lib.Services.rules.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import LLDRuleEngine.lib.Services.RuleEngine;
import LLDRuleEngine.lib.Services.rules.ExpenseRule;
import LLDRuleEngine.lib.Services.rules.TripRule;
import LLDRuleEngine.lib.Services.rules.Violation;
import LLDRuleEngine.lib.models.Expense;
import LLDRuleEngine.lib.models.ExpenseType;

public class SimpleRuleEngine implements RuleEngine{

    @Override
    public List<Violation> evaluate(List<Expense> expenses,
            Map<ExpenseType, List<ExpenseRule>> expenseRulesRegistry, List<ExpenseRule> getAllExpenseRulesRegistry,
            List<TripRule> tripRulesRegistry) {

                List<Violation> violations =  new ArrayList<>();

                // 1. Check all expenses against expense rules.

                for (Expense expense : expenses)
                {
                    // fetch all the rules for the expense type if no rules are found then we have empty list.
                    List<ExpenseRule> rules  = expenseRulesRegistry.getOrDefault(expense.getExpenseType(), List.of());
                    
                    checkExpenseAgainstRule(expense, rules, violations);
                    checkExpenseAgainstRule(expense, getAllExpenseRulesRegistry, violations);
                }

                // 2. Check all expenses against all trip rules.

                for (TripRule rule : tripRulesRegistry)
                {
                    Optional<Violation> violation = rule.check(expenses);
                    if (violation.isPresent())
                    {
                        violations.add(violation.get());
                    }
                }

                return violations;

    }

    private void checkExpenseAgainstRule(Expense expense, List<ExpenseRule> rules, List<Violation> violations)
    {
        for (ExpenseRule rule : rules)
        {
            Optional<Violation> violation = rule.check(expense);
            if (violation.isPresent())
            {
                violations.add(violation.get());
            }
        }
    }

}
