package com.mdh.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * 使用JPA注解配置映射关系
 * @Entity 告诉JPA这是一个实体类( 和数据表映射的类 )
 * @Table(name = "tbl_user")  @Table来指定和哪个数据表对应;如果省略默认表名就是user
 * @JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" }) 就是标注哪个属性不用转化为json的
 * @Author: madonghao
 * @Date: 2019/1/28 15:42
 */
@Entity
@Table(name = "tbl_user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User {

    /**
     * @Id  主键
     * @GeneratedValue(strategy = GenerationType.IDENTITY)  自增主键策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 和数据表对应的列,数据表的名称为last_name，省略则默认列名就是属性名
     */
    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
