package com.kodilla.patterns.Strategy;

import com.kodilla.patterns.Strategy.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer{
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
