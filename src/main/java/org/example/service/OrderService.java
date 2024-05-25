package org.example.service;

import org.example.dao.OrderDao;
import org.example.dto.Result;
import org.example.entity.Orders;
import org.example.entity.Users;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private OrderDao orderDao;

    public OrderService(OrderDao orderDao){
        this.orderDao = orderDao;
    }

    public Result createOrder(Orders orders){
        orderDao.save(orders);
        return new Result<>(200, "success");
    }

    public Result updateOrder(Orders orders){
        orderDao.save(orders);
        return new Result<>(200, "success");
    }

    public Result deleteOrder(Integer id){
        orderDao.deleteById(id);
        return new Result<>(200, "success");
    }

    public Result getOrder(Integer id){
        Optional<Orders> ordersOptional = orderDao.findById(id);
        if(ordersOptional.isPresent()){
            return new Result(200, ordersOptional.get());
        } else {
            return new Result(999,"no data");
        }
    }
}
