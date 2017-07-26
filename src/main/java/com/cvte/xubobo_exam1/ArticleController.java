package com.cvte.xubobo_exam1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    //得到文章列表
    @GetMapping(value = "/articles")
    public List<Article> articleList(){
        return articleRepository.findAll();
    }

    //根据文章id来查询文章
    @GetMapping(value = "/articles/{id}")
    public Article articleGetById(@PathVariable Integer id){
        return articleRepository.findOne(id);
    }

    //插入一个文章记录
    @PostMapping(value = "/articles")
    public Article articleAdd(@RequestParam("title") String title,
                              @RequestParam("content") String content,
                              @RequestParam("created_time") BigInteger created_time,
                              @RequestParam("updated_time") BigInteger updated_time
                              ){
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setCreated_time(created_time);
        article.setUpdated_time(updated_time);
        article.setIs_del(false);

        return articleRepository.save(article);
    }

    //删除一个文章（通过id删除）
    @DeleteMapping(value = "/articles/{id}")
    public void articleDelete(@PathVariable("id") Integer id){
        articleRepository.delete(id);
    }

    //修改一篇文章
    @PutMapping(value = "/articles/{id}")
    public Article articleUpdate(@PathVariable("id") Integer id,
                              @RequestParam("title") String title,
                              @RequestParam("content") String content,
                              @RequestParam("created_time") BigInteger created_time,
                              @RequestParam("updated_time") BigInteger updated_time){
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setCreated_time(created_time);
        article.setUpdated_time(updated_time);
        article.setIs_del(false);

        return articleRepository.save(article);
    }
}
