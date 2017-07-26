package com.cvte.xubobo_exam1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String content;

    private BigInteger created_time;

    private BigInteger updated_time;

    private boolean is_del;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public BigInteger getCreated_time() {
        return created_time;
    }

    public BigInteger getUpdated_time() {
        return updated_time;
    }

    public boolean isIs_del() {
        return is_del;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreated_time(BigInteger created_time) {
        this.created_time = created_time;
    }

    public void setUpdated_time(BigInteger updated_time) {
        this.updated_time = updated_time;
    }

    public void setIs_del(boolean is_del) {
        this.is_del = is_del;
    }
}
