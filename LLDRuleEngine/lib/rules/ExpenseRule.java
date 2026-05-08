package LLDRuleEngine.lib.rules;

import java.util.Optional;

import LLDRuleEngine.lib.models.Expense;

public interface ExpenseRule {
    Optional<Violation> check(Expense e);
}
