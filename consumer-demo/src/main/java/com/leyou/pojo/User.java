package com.leyou.pojo;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author cocoyang
 * @date 2019/5/8
 */

@Data
@Slf4j
public class User implements Serializable {

    private Long id;

    private String username;
    private int age;
    private String passwrod;
    private String email;
    private String sex;


}
