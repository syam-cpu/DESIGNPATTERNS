package LLDRuleEngine.lib.utils;

import java.util.List;

import LLDRuleEngine.lib.models.Expense;

public class ExpenseUtils {
    public static boolean areAllExpenseOfSameTrip(List<Expense> expenses)
    {
        if (expenses.isEmpty())
        {
            return true;
        }

        String tripId = expenses.get(0).getTripId();

        for (Expense expense : expenses)
        {
            if (!expense.getTripId().equals(tripId))
            {
                return false;
            }
        }
        
        return true;
    }
}
