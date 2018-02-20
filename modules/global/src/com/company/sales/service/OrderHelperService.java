package com.company.sales.service;


import com.company.sales.entity.Order;
import com.company.sales.entity.OrderLine;

import java.math.BigDecimal;
import java.util.Collection;

public interface OrderHelperService {
    String NAME = "sales_OrderHelperService";
    public BigDecimal calculateAmount(Order order, Collection<OrderLine> items);
}