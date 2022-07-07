package geektime.spring.springbucks.service;

import geektime.spring.springbucks.mapper.OrderMapper;
import geektime.spring.springbucks.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 根据id编号查找咖啡
     *
     * @param id
     * @return
     */
    public Order findById(Long id) {
        return orderMapper.findById(id);
    }

    /**
     * 新增订单
     *
     * @param order
     * @return
     */
    @Transactional
    public int save(Order order) {
        return orderMapper.save(order);
    }

    /**
     * 修改订单
     *
     * @param order
     * @return
     */
    @Transactional
    public int upd(Order order) {
        return orderMapper.upd(order);
    }

    /**
     * 删除订单
     *
     * @param id
     * @return
     */
    @Transactional
    public int del(Long id) {
        return orderMapper.del(id);
    }

}
