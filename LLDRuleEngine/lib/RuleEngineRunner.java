package LLDRuleEngine.lib;

import java.util.List;
import java.util.Map;

import LLDRuleEngine.lib.Services.RuleEngine;
import LLDRuleEngine.lib.Services.rules.ExpenseRule;
import LLDRuleEngine.lib.Services.rules.TripRule;
import LLDRuleEngine.lib.Services.rules.Violation;
import LLDRuleEngine.lib.models.Expense;
import LLDRuleEngine.lib.models.ExpenseType;
import LLDRuleEngine.lib.registry.RuleRegistry;

public class RuleEngineRunner {
    
    private final RuleEngine ruleEngine;

    public RuleEngineRunner(RuleEngine ruleEngine)
    {
        this.ruleEngine = ruleEngine;
    }

    public void run(List<Expense> expenses)
    {
        Map<ExpenseType, List<ExpenseRule>> expenseRulesRegistry = RuleRegistry.getExpenseRuleRegistry();
        List<ExpenseRule> allExpenseRulesRegistry = RuleRegistry.getAllExpenseRulesRegistry();
        List<TripRule> tripRulesRegistry = RuleRegistry.getAllTripRulesRegistry();

        List<Violation> violations = ruleEngine.evaluate(expenses, expenseRulesRegistry, allExpenseRulesRegistry, tripRulesRegistry);
        

        for (Violation violation : violations)
        {
            System.out.println(violation.getMessage());
        }
    }
}
