package com.enhanced;

public class FinancialBankCreator {
    public static  FinancialBank create(Banks bank) {
        switch (bank) {
            case ABank:
                return new AFinancialBank();
            case BBank:
                return new BFinancialBank();
        }
        return null;
    }
}
