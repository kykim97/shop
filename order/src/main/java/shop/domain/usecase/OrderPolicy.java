package shop.domain.usecase;

import shop.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class OrderPolicy{
    @Autowired
    OrderRepository orderRepository;

    public void apologizeCustomer(OutOfStockOccurred outOfStockOccurred){

        Order order = new Order();
        /*
        LOGIC GOES HERE
        */
        // orderRepository.save(order);


    }
}