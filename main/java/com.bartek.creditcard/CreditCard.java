package com.bartek.creditcard;

import com.bartek.creditcard.exception.CardLimitAlreadyAssignedException;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal limit;

    public void assignLimit(BigDecimal newLimit) {
        if (limit != null) {
            throw new CardLimitAlreadyAssignedException();
        }
        if (newLimit.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegativeLimitAssignException();
        }
        this.limit = newLimit;
    }

    public BigDecimal getLimit() {
        return limit;
    }
}
