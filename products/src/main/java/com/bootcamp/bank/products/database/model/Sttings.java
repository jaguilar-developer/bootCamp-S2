package com.bootcamp.bank.products.database.model;

import lombok.Data;

@Data
public class Sttings {

    private Number maintenanceInterest;
    private Number maxTransactionsPerMonth;
    private Number creditLimit;
    private Number minAveragePerDay;
}
