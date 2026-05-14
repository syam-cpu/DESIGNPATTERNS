package LLDRuleEngine.lib.models;


//Ideally made using a builder pattern
public class Expense {
    private final String id;
    private final String tripId;
    private final Double amountUsd;

    private final ExpenseType expenseType;

    public Expense(String expenseId, String tripId, Double amountUsd, ExpenseType expenseType)
    {
        this.id = expenseId;
        this.tripId = tripId;
        this.amountUsd = amountUsd;
        this.expenseType = expenseType;
    }

    public String getExpenseId()
    {
        return id;
    }

    public String getTripId()
    {
        return tripId;
    }

    public Double getAmountUsd()
    {
        return amountUsd;
    }

    public ExpenseType getExpenseType()
    {
        return expenseType;
    }
}
