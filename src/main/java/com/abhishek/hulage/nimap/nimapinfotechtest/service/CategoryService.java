package com.abhishek.hulage.nimap.nimapinfotechtest.service;

import com.abhishek.hulage.nimap.nimapinfotechtest.entity.Category;
import com.abhishek.hulage.nimap.nimapinfotechtest.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategoriesByPageNumber(int pageNumber, int pageSize){
        PageRequest pageRequest = PageRequest.of(pageNumber,pageSize);
        Page<Category> paginatedCategories = categoryRepository.findAll(pageRequest);
        return paginatedCategories.getContent();
    }

    public Category getCategoryById(int id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.stream().findFirst().orElseThrow();
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public Category updateCategory(int id, Category updatedCategory){
        return categoryRepository.findById(id).map(category -> {
            category.setCategoryDesc(updatedCategory.getCategoryDesc());
            return categoryRepository.save(category);
        }).orElseThrow();
    }

    public void deleteCategory(int id){
        categoryRepository.deleteById(id);
    }


}
