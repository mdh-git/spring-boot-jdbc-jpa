package com.mdh.springboot.repository;

import com.mdh.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承JpaRepository来完成对数据库的操作
 * @Author: madonghao
 * @Date: 2019/1/28 17:27
 */
public interface UserRepository extends JpaRepository<User, Integer>{
}
