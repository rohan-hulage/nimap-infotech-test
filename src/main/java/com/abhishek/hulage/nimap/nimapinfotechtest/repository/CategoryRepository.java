package com.abhishek.hulage.nimap.nimapinfotechtest.repository;

import com.abhishek.hulage.nimap.nimapinfotechtest.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Integer> ,CrudRepository<Category,Integer>{

}
