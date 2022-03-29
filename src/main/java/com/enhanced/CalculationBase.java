package com.enhanced;

import java.util.Objects;

public class CalculationBase {
    protected void validate(InterestType type) {
        if(Objects.isNull(type)) {
            throw new IllegalArgumentException("Loan type is not provided.");
        }
    }
}
