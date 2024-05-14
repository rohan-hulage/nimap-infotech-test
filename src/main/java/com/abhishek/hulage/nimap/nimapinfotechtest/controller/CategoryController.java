package com.abhishek.hulage.nimap.nimapinfotechtest.controller;

import com.abhishek.hulage.nimap.nimapinfotechtest.entity.Category;
import com.abhishek.hulage.nimap.nimapinfotechtest.repository.CategoryRepository;
import com.abhishek.hulage.nimap.nimapinfotechtest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories(@RequestParam(defaultValue = "0") Integer pageNumber,
                                           @RequestParam(defaultValue = "5") Integer page){
        return categoryService.getAllCategoriesByPageNumber(pageNumber,page);
    }

    @GetMapping(value = "/categories/{id}")
    public Category getCategoryById(@PathVariable Integer id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/categories/{id}")
    public Category updateCategory(@PathVariable Integer id, @RequestBody Category updatedCategory) {
        return categoryService.updateCategory(id, updatedCategory);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
    }


}
