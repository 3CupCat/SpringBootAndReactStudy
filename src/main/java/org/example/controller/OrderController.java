package org.example.controller;

import org.example.dto.Result;
import org.example.entity.Orders;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }

    @PostMapping("/createOrder")
    public Result createOrder(@RequestBody Orders orders){
        return orderService.createOrder(orders);
    }

    @PutMapping("/updateOrder")
    public Result updateOrder(@RequestBody Orders orders){
        return orderService.updateOrder(orders);
    }
    @DeleteMapping("/deleteOrder/{id}")
    public Result deleteOrder(@PathVariable Integer id){
        return orderService.deleteOrder(id);
    }
    @GetMapping("/getOrder/{id}")
    public Result getOrder(@PathVariable Integer id){
        return orderService.getOrder(id);
    }
}
