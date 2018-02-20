package com.company.sales.web.order;

import com.company.sales.entity.OrderLine;
import com.company.sales.service.OrderHelperService;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.sales.entity.Order;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class OrderEdit extends AbstractEditor<Order> {

    @Inject
    private CollectionDatasource<OrderLine, UUID> linesDs;

    @Inject
    private OrderHelperService orderHelperService;

    @Override
    public void init(Map<String, Object> params) {
        linesDs.addCollectionChangeListener(e -> {
            Collection<OrderLine> items = linesDs.getItems();
            Order order = getItem();
            orderHelperService.calculateAmount(order, items);
        });
    }


}