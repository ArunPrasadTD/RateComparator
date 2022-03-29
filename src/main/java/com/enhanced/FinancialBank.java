package com.enhanced;

public interface FinancialBank {

    InterestCalculator getCalculator(InterestType savings);
}
