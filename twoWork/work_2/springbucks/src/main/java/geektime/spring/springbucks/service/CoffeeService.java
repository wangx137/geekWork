package geektime.spring.springbucks.service;

import geektime.spring.springbucks.mapper.CoffeeMapper;
import geektime.spring.springbucks.model.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class CoffeeService {

    @Autowired
    private CoffeeMapper coffeeMapper;

    /**
     * 根据id编号查找咖啡
     *
     * @param id
     * @return
     */
    public Coffee findById(Long id) {
        return coffeeMapper.findById(id);
    }

    /**
     * 新增咖啡
     *
     * @param coffee
     * @return
     */
    @Transactional
    public int save(Coffee coffee) {
        return coffeeMapper.save(coffee);
    }

    /**
     * 修改咖啡
     *
     * @param coffee
     * @return
     */
    @Transactional
    public int upd(Coffee coffee) {
        return coffeeMapper.upd(coffee);
    }

    /**
     * 删除咖啡
     *
     * @param id
     * @return
     */
    @Transactional
    public int del(Long id) {
        return coffeeMapper.del(id);
    }

}
