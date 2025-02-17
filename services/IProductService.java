package com.example.shopapptech.services;
import com.example.shopapptech.dtos.ProductDTO;
import com.example.shopapptech.dtos.ProductImageDTO;
import com.example.shopapptech.exceptions.DataNotFoundException;
import com.example.shopapptech.responses.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.shopapptech.models.*;

public interface IProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<ProductResponse> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO) throws Exception;

}
