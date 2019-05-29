package com.wang.clouddemo.demo.repository;


import com.wang.clouddemo.demo.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment,String> {
}
