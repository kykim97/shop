package shop.domain.usecase;

import shop.OrderApplication;
import shop.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class OrderCommand{
    @Autowired
    OrderRepository orderRepository;

}