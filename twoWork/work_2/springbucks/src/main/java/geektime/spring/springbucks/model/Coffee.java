package geektime.spring.springbucks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coffee implements Serializable {

    /**
     * 咖啡id
     */
    private Long id;

    /**
     * 咖啡名称
     */
    private String name;

    /**
     * 咖啡价格
     */
    private Double price;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
