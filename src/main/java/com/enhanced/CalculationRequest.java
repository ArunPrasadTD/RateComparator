package com.enhanced;

import java.util.Objects;

public class CalculationRequest implements ICalculationRequest {
    private Integer duration;
    private double principal;
    private InterestType type;
    private Boolean durationInMonths;
    private Boolean amountInAud;
    private CalculationRequest(){}

    public static CalculationRequest newBuilder(){
        return new CalculationRequest();
    }
    public Integer getDuration() {
        return duration;
    }

    public CalculationRequest setDuration(Integer duration) {
        if(Objects.isNull(this.duration)) {
            this.duration = duration;
        }
        return this;
    }

    public Double getPrincipal() {
        return principal;
    }

    public CalculationRequest setPrincipal(double principal) {
        if(this.principal==0.0) {
            this.principal = principal;
        }
        return this;
    }

    public InterestType getType() {
        return type;
    }

    public CalculationRequest setType(InterestType type) {
        if(Objects.isNull(this.type)) {
            this.type = type;
        }
        return this;
    }

    public Boolean getDurationInMonths() {
        return durationInMonths;
    }

    public CalculationRequest setDurationInMonths(Boolean durationInMonths) {
        if(Objects.isNull(this.durationInMonths)) {
            this.durationInMonths = durationInMonths;
        }
        return this;
    }

    public Boolean getAmountInAud() {
        return amountInAud;
    }

    public CalculationRequest setAmountInAud(Boolean amountInAud) {
        if(Objects.isNull(this.amountInAud)) {
            this.amountInAud = amountInAud;
        }
        return this;
    }
}
