package org.jucp.blog.services;

import java.util.List;

import org.jucp.blog.model.Blog;

public interface BlogService {
    List<Blog> getAllBlogs();

    void saveBlog(Blog blog);
}
