package com.wang.clouddemo.demo.repository;


import com.wang.clouddemo.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUid(int uid);
    String deleteByUid(int uid);
}
