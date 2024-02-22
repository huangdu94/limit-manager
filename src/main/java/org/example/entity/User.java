package org.example.entity;

import java.util.Date;

import lombok.Data;

/**
 * 用户
 *
 * @author yiyun (huangdu.hd@alibaba-inc.com)
 */
@Data
public class User {
    private Long id;
    private Date createTime;
    private Date updateTime;
    private String name;
}
