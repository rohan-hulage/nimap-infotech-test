package com.abhishek.hulage.nimap.nimapinfotechtest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {

    @Id
    private int categoryId;
    private String categoryDesc;

    public Category(){

    }
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }
}
