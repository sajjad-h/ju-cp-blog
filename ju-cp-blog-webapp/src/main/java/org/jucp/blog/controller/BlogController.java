package org.jucp.blog.controller;

import org.jucp.blog.model.Blog;
import org.jucp.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping(path = "")
    public String viewBlogs(Model model) {
        model.addAttribute("blogs", blogService.getAllBlogs());
        return "index";
    }

    @GetMapping("/showNewBlogForm") 
    public String showNewBlogForm(Model model) {
        Blog blog=new Blog();
        model.addAttribute("blog", blog);
        return "newBlog";
    }

    @PostMapping("/saveBlog")
    public String saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.saveBlog(blog);
        return "redirect:/blogs";     
    }

    @PostMapping("/pictureUpload")
    public String pictureUpload(Model model) {
        System.out.println(model.toString());
        System.out.println("hitted ***");
        return "redirect:/blogs";
    }
}