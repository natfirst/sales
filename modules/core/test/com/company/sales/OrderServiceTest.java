package com.company.sales;

import com.company.sales.entity.Order;
import com.company.sales.entity.OrderLine;
import com.company.sales.entity.Product;
import com.company.sales.service.OrderHelperServiceBean;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class OrderServiceTest {

    private OrderHelperServiceBean orderService;
    private Order order;

    @Before
    public void setUp() throws Exception {
        orderService = new OrderHelperServiceBean();

        order = new Order();
        order.setDate(new Date());

        Product product = new Product();
        product.setName("Pen");
        product.setPrice(BigDecimal.TEN);

        OrderLine orderLine = new OrderLine();
        orderLine.setProduct(product);
        orderLine.setQuantity(BigDecimal.valueOf(2));
        orderLine.setOrder(order);

        order.setLines(Collections.singletonList(orderLine));
    }

    @Test
    public void testCalculateAmount() {
        BigDecimal amount = orderService.calculateAmount(order, order.getLines());
        order.setAmount(amount);
        assertEquals(BigDecimal.valueOf(20), amount);
    }



}
