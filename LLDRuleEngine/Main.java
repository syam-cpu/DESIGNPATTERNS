package LLDRuleEngine;

import java.util.ArrayList;
import java.util.List;

import LLDRuleEngine.lib.RuleEngineRunner;
import LLDRuleEngine.lib.Services.rules.Violation;
import LLDRuleEngine.lib.Services.rules.impl.SimpleRuleEngine;
import LLDRuleEngine.lib.models.Expense;
import LLDRuleEngine.lib.models.ExpenseType;
import LLDRuleEngine.lib.registry.RuleRegistry;

public class Main {
    public static void main(String[] args) {

        List<Expense> expenses = new ArrayList<>();

        expenses.add(new Expense("1", "1", 10.0, ExpenseType.RESTAURANT));
        expenses.add(new Expense("2", "1", 50.0, ExpenseType.RESTAURANT));
        expenses.add(new Expense("3", "1", 100.0, ExpenseType.RESTAURANT));

        RuleEngineRunner ruleEngineRunner = new RuleEngineRunner(new SimpleRuleEngine());
        ruleEngineRunner.run(expenses);
    }
}
