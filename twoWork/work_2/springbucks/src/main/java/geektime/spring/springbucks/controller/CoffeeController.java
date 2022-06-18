package geektime.spring.springbucks.controller;

import geektime.spring.springbucks.model.Coffee;
import geektime.spring.springbucks.model.Order;
import geektime.spring.springbucks.service.CoffeeService;
import geektime.spring.springbucks.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @Autowired
    private OrderService orderService;

    /**
     * 根据id查询咖啡 xml格式
     * @param id
     * @return
     */
    @GetMapping(path="/queryCoffeeXml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Coffee queryCoffeeXml(@PathVariable("id") Long id){
        return coffeeService.findById(id);
    }

    /**
     * 根据id查询咖啡 json格式
     * @param id
     * @return
     */
    @GetMapping(path="/queryCoffeeJson/{id}")
    @ResponseBody
    public Coffee queryCoffeeJson(@PathVariable("id") Long id){
        return coffeeService.findById(id);
    }

    /**
     * 根据id查询订单 xml格式
     * @param id
     * @return
     */
    @GetMapping(path="/queryOrderXml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Order queryOrderXml(@PathVariable("id") Long id){
        return orderService.findById(id);
    }

    /**
     * 根据id查询订单 json格式
     * @param id
     * @return
     */
    @GetMapping(path="/queryOrderJson/{id}")
    @ResponseBody
    public Order queryOrderJson(@PathVariable("id") Long id){
        return orderService.findById(id);
    }

}
