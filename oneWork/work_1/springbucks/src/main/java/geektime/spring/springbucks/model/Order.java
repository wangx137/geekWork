package geektime.spring.springbucks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    /**
     * 订单id
     */
    private Long id;

    /**
     * 订单用户
     */
    private String customer;

    /**
     * 订单咖啡
     */
    private Long coffeeId;

    /**
     * 订单状态
     */
    private String state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
