package com.company.sales;

import com.company.sales.entity.Order;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;

public class OrderTest {

    private Order order;

    @Test
    public void testOrderDate() {
        order = new Order();
        order.setAmount(BigDecimal.valueOf(45387));
        assertNotNull(order.getAmount());
    }
}
