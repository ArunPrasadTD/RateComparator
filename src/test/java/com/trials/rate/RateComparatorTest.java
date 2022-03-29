package com.trials.rate;

import com.enhanced.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(MockitoJUnitRunner.class)
public class RateComparatorTest {
    private static final double DELTA = 1e-15;

    @Test
    @DisplayName("Displays sorted interest rates")
    public void testMultiBankRatesComparison() {
        ICalculationRequest request = RequestCreator.create(5,25000.0, InterestType.Home, false, true);
        List<Banks> banks = Arrays.asList(Banks.values());
        List<ICalculationResponse> response = new ArrayList<>();
        banks.stream().forEach(bank -> {
            FinancialBank financialBank = FinancialBankCreator.create(bank);
            InterestCalculator calculator = financialBank.getCalculator(InterestType.Savings);
            ICalculationResponse calculationResponse = calculator.calculate(request);
            response.add(calculationResponse);
        });

        List<ICalculationResponse> sortedResponse = response.stream().sorted(Comparator.comparingDouble(ICalculationResponse::getAmountPayable)).collect(Collectors.toList());

        System.out.println(sortedResponse);
    }
}
