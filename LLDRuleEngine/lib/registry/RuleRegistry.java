package LLDRuleEngine.lib.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLDRuleEngine.lib.models.ExpenseType;
import LLDRuleEngine.lib.rules.ExpenseRule;
import LLDRuleEngine.lib.rules.impl.DisallowRule;

public class RuleRegistry {
    public static void getRegistry()
    {
        Map<ExpenseType, List<ExpenseRule>> registry =  new HashMap<>();

        registry.put(ExpenseType.RESTAURANT, List.of(new DisallowRule()));

        registry.put(ExpenseType.AIRFARE, List.of(new DisallowRule()));

        registry.put(ExpenseType.ENTERTAINMENT, List.of(new DisallowRule()));

    }
    
}
