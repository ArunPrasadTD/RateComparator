package com.enhanced;

import java.util.Objects;

public class CalculationResponse implements ICalculationResponse {
    private Double principal;
    private Double amountPayable;
    private String bankName;
    
    public static CalculationResponse newBuilder() {
        return new CalculationResponse();
    }

    public CalculationResponse setPrincipal(Double principal) {
        if(Objects.isNull(this.principal)) {
            this.principal = principal;
        }
        return this;
    }

    public CalculationResponse setAmountPayable(Double amountPayable) {
        if(Objects.isNull(this.amountPayable)) {
            this.amountPayable = amountPayable;
        }
        return this;
    }

    public CalculationResponse setBankName(String bankName) {
        if(Objects.isNull(this.bankName)) {
            this.bankName = bankName;
        }
        return this;
    }

    @Override
    public double getPrincipal() {
        return principal;
    }

    @Override
    public double getAmountPayable() {
        return amountPayable;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "CalculationResponse{" +
                "principal=" + principal +
                ", amountPayable=" + amountPayable +
                ",bankName='" + bankName + '\'' +
                '}';
    }
}
