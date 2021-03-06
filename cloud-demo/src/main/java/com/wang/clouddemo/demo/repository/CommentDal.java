package com.wang.clouddemo.demo.repository;


import com.wang.clouddemo.demo.pojo.Comment;

import java.util.List;

public interface CommentDal {
    List<Comment> getAll();

    Comment getById(String id);

    Comment addComment(Comment comment);

    Object getAllTags(String id);

    String addTag(String id, String key, String value);

    String statAnalysis();
}
