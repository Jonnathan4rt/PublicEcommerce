package com.rog.ecommerce.infrastructure.adapter;

import com.rog.ecommerce.infrastructure.entity.ProductEntity;
import com.rog.ecommerce.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository  extends CrudRepository<ProductEntity, Integer> {
    Iterable<ProductEntity> findByUserEntity (UserEntity userEntity);
}
