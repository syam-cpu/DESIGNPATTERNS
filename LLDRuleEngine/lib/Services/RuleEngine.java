package LLDRuleEngine.lib.Services;

import java.util.List;
import java.util.Map;

import LLDRuleEngine.lib.Services.rules.ExpenseRule;
import LLDRuleEngine.lib.Services.rules.TripRule;
import LLDRuleEngine.lib.Services.rules.Violation;
import LLDRuleEngine.lib.models.Expense;
import LLDRuleEngine.lib.models.ExpenseType;

public interface RuleEngine {

    List<Violation> evaluate(
        List<Expense> expenses, // incoming expenses
        Map<ExpenseType, List<ExpenseRule>> expenseRulesRegistry, // expense rules registry.
        List<ExpenseRule> getAllExpenseRulesRegistry, // all expense rules registry.
        List<TripRule> tripRulesRegistry // all trip rules registry.
    );

}
