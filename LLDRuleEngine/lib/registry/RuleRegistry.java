package LLDRuleEngine.lib.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLDRuleEngine.lib.Services.rules.ExpenseRule;
import LLDRuleEngine.lib.Services.rules.TripRule;
import LLDRuleEngine.lib.Services.rules.impl.DisallowRule;
import LLDRuleEngine.lib.Services.rules.impl.MaxAmountRule;
import LLDRuleEngine.lib.Services.rules.impl.TripTotalMaxRule;
import LLDRuleEngine.lib.models.Expense;
import LLDRuleEngine.lib.models.ExpenseType;

public class RuleRegistry {
    public static Map<ExpenseType, List<ExpenseRule>> getExpenseRuleRegistry()
    {
        Map<ExpenseType, List<ExpenseRule>> registry =  new HashMap<>();

        registry.put(ExpenseType.RESTAURANT, List.of(new MaxAmountRule(75)));

        registry.put(ExpenseType.AIRFARE, List.of(new DisallowRule()));

        registry.put(ExpenseType.ENTERTAINMENT, List.of(new DisallowRule()));

        return registry;
    }

    public static List<ExpenseRule> getAllExpenseRulesRegistry()
    {
        return List.of(new MaxAmountRule(200));
    }

    public static List<TripRule> getAllTripRulesRegistry()
    {
        return List.of(new TripTotalMaxRule(1000));
    }
}



