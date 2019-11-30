package com.qf.repository;

import com.qf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ding on 2019/11/27.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
