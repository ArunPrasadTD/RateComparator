package com.enhanced;

import java.util.HashMap;
import java.util.Map;

public class BFinancialBank implements FinancialBank {

    public BFinancialBank() {
        map = new HashMap<>();
        map.put(InterestType.Home, new BHomeLoanCalculator());
        map.put(InterestType.Car, new BCarLoanCalculator());
        map.put(InterestType.Biz, new BBizLoanCalculator());
        map.put(InterestType.Savings, new BSavingsLoanCalculator());
    }

    private Map<InterestType, InterestCalculator> map;

    @Override
    public InterestCalculator getCalculator(InterestType type) {
        return map.get(type);
    }
}
