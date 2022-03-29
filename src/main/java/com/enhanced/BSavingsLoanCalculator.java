package com.enhanced;

public class BSavingsLoanCalculator extends CalculationBase implements InterestCalculator {

    public ICalculationResponse calculate(ICalculationRequest request) {
        validate(request.getType());
        double rate = 2.5;
        Double amountPayable;
        amountPayable = (request.getPrincipal() * (request.getDuration()) * rate) / 100.0;
        return CalculationResponse.newBuilder()
                .setPrincipal(request.getPrincipal())
                .setAmountPayable(amountPayable)
                .setBankName("BBank");
    }
}
