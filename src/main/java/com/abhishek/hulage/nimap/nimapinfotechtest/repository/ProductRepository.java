package com.abhishek.hulage.nimap.nimapinfotechtest.repository;

import com.abhishek.hulage.nimap.nimapinfotechtest.entity.Category;
import com.abhishek.hulage.nimap.nimapinfotechtest.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Integer>, CrudRepository<Product,Integer> {

}

