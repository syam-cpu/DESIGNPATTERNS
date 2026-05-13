package LLDRuleEngine.lib.Services.rules;

import java.util.List;
import java.util.Optional;

import LLDRuleEngine.lib.models.Expense;

public interface TripRule {
    Optional<Violation> check(List<Expense> expenses);
    
}
