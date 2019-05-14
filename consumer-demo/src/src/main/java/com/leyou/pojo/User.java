package com.leyou.pojo;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author cocoyang
 * @date 2019/5/8
 */

@Data
public class User implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String username;
    private int age;
    private String passwrod;
    private String email;
    private String sex;


}
