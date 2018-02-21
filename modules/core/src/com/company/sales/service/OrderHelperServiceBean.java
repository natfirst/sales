package com.company.sales.service;

import com.company.sales.StupidClass;
import com.company.sales.entity.Order;
import com.company.sales.entity.OrderLine;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;

@Service(OrderHelperService.NAME)
public class OrderHelperServiceBean implements OrderHelperService {

    public BigDecimal calculateAmount(Order order, Collection<OrderLine> items) {
        return new StupidClass().calculateAmount(order, items);
    }
}