package com.learn.springboot.service.impl;

import com.learn.springboot.mapper.PostMapper;
import com.learn.springboot.pojo.Post;
import com.learn.springboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostMapper postMapper;

    @Override
    public void add(Post p) {
        postMapper.add(p);
    }

    @Override
    public void view(int pid) {
        postMapper.view(pid);
    }

    @Override
    public void update(Post p) {
        postMapper.update(p);
    }

    @Override
    public Post get(int pid) {
        return postMapper.get(pid);
    }

    @Override
    public int getCount() {
        return postMapper.getPostCount();
    }

    @Override
    public List<Post> getAll() {
        return postMapper.findAll();
    }

    @Override
    public List<Post> getRecent() {
        return postMapper.findRecent();
    }
}
