package com.enhanced;

public class RequestCreator {
    public static ICalculationRequest create(int duration, double principal, InterestType interestType, boolean durationInMonths, boolean amountInAud){
        return CalculationRequest.newBuilder()
                .setDuration(duration)
                .setPrincipal(principal)
                .setType(interestType)
                .setDurationInMonths(durationInMonths)
                .setAmountInAud(amountInAud);
    }
}
