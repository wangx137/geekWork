package geektime.spring.springbucks;

import com.github.pagehelper.PageHelper;
import geektime.spring.springbucks.model.Coffee;
import geektime.spring.springbucks.model.Order;
import geektime.spring.springbucks.model.OrderState;
import geektime.spring.springbucks.service.CoffeeService;
import geektime.spring.springbucks.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

@Slf4j
@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "geektime.spring.springbucks.mapper")
public class SpringBucksApplication {

	@Autowired
	private CoffeeService coffeeService;

	@Autowired
	private OrderService orderService;

//	@Autowired(required = false)
//	private RedisTemplate<Object, Object> redisTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBucksApplication.class, args);
	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		//新增咖啡
//		Coffee coffee = new Coffee();
//		coffee.setName("natie");
//		coffee.setPrice(2000.00);
//		coffee.setCreateTime(new Date());
//		coffee.setUpdateTime(new Date());
//		coffeeService.save(coffee);
//		log.info("===Save Coffee Id {}===", coffee.getId());
//
//		//查询咖啡
//		PageHelper.startPage(1, 5);
//		Coffee findCoffee = coffeeService.findById(coffee.getId());
//		if(!ObjectUtils.isEmpty(findCoffee)){
//			redisTemplate.opsForValue().set("findCoffee", findCoffee);
//		}
//		log.info("===Find Coffee {}===", findCoffee);
//
//		//修改咖啡
//		Coffee updCoffee = new Coffee();
//		updCoffee.setId(coffee.getId());
//		updCoffee.setName("maqiduo");
//		updCoffee.setUpdateTime(new Date());
//		coffeeService.upd(updCoffee);
//
//		//查询修改后的咖啡
//		PageHelper.startPage(1, 5);
//		Coffee updFindCoffee = coffeeService.findById(coffee.getId());
//		if(!ObjectUtils.isEmpty(updFindCoffee)){
//			redisTemplate.opsForValue().set("updFindCoffee", updFindCoffee);
//		}
//		log.info("===Find upd Coffee {}===", updFindCoffee);
//
//		//新增订单
//		Order order = new Order();
//		order.setCustomer("zhangsan");
//		order.setCoffeeId(coffee.getId());
//		order.setCreateTime(new Date());
//		order.setUpdateTime(new Date());
//		order.setState(OrderState.INIT.name());
//		orderService.save(order);
//		log.info("===Save Order Id {}===", order.getId());
//
//		//查询订单
//		PageHelper.startPage(1, 5);
//		Order findOrder = orderService.findById(order.getId());
//		if(!ObjectUtils.isEmpty(findOrder)){
//			redisTemplate.opsForValue().set("findOrder", findOrder);
//		}
//		log.info("===Find Order {}===", findOrder);
//
//		//修改订单
//		Order updOrder = new Order();
//		updOrder.setId(order.getId());
//		updOrder.setState(OrderState.PAID.name());
//		updOrder.setUpdateTime(new Date());
//		orderService.upd(updOrder);
//
//		//查询修改后的订单
//		PageHelper.startPage(1, 5);
//		Order updFindOrder = orderService.findById(order.getId());
//		if(!ObjectUtils.isEmpty(updFindOrder)){
//			redisTemplate.opsForValue().set("updFindOrder", updFindOrder);
//		}
//		log.info("===Find upd Order {}===", updFindOrder);
//
//		//删除咖啡
//		coffeeService.del(coffee.getId());
//		//删除订单
//		orderService.del(order.getId());
//	}

}

