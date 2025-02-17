package com.example.shopapptech.services;

import com.example.shopapptech.dtos.OrderDTO;
import com.example.shopapptech.exceptions.DataNotFoundException;
import com.example.shopapptech.models.Order;
import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
}
