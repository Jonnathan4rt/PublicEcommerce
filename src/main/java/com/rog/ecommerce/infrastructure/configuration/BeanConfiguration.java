package com.rog.ecommerce.infrastructure.configuration;

import com.rog.ecommerce.application.repository.ProductRepository;
import com.rog.ecommerce.application.service.ProductService;
import com.rog.ecommerce.application.service.UploadFile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public ProductService productService(ProductRepository productRepository, UploadFile uploadFile){
        return new ProductService(productRepository, uploadFile);
    }
    @Bean
    public UploadFile uploadFile(){
        return new UploadFile();
    }

}
