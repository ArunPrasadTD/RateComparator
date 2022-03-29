package com.enhanced;

import java.util.HashMap;
import java.util.Map;

public class AFinancialBank implements FinancialBank {

    public AFinancialBank() {
        map = new HashMap<>();
        map.put(InterestType.Home, new AHomeLoanCalculator());
        map.put(InterestType.Car, new ACarLoanCalculator());
        map.put(InterestType.Biz, new ABizLoanCalculator());
        map.put(InterestType.Savings, new ASavingsLoanCalculator());
    }

    private Map<InterestType, InterestCalculator> map;

    @Override
    public InterestCalculator getCalculator(InterestType type) {
        return map.get(type);
    }
}
