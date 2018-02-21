package com.company.sales;

import com.company.sales.entity.Order;
import com.company.sales.entity.OrderLine;

import java.math.BigDecimal;
import java.util.Collection;

public class StupidClass {

    public BigDecimal calculateAmount(Order order, Collection<OrderLine> items) {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderLine line : items) {
            amount = amount.add(line.getProduct().getPrice().multiply(line.getQuantity()));
        }
        return amount;
    }
}
