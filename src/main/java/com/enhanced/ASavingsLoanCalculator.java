package com.enhanced;

public class ASavingsLoanCalculator extends CalculationBase implements InterestCalculator {

    public ICalculationResponse calculate(ICalculationRequest request) {
        validate(request.getType());
        double rate = 3.5;
        Double amountPayable;
        amountPayable = (request.getPrincipal() * (request.getDuration()) * rate) / 100.0;
        return CalculationResponse.newBuilder()
                .setPrincipal(request.getPrincipal())
                .setAmountPayable(amountPayable)
                .setBankName("ABank");
    }
}
