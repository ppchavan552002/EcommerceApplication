package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Page<Product> getAllProducts(int page, int size) {
		return productRepository.findAll(PageRequest.of(page,size));
	}
	
	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(Long id, Product updateProduct) {
		return productRepository.findById(id).map(product ->{
			product.setName(updateProduct.getName());
			product.setPrice(updateProduct.getPrice());
			return productRepository.save(product);
		}).orElseThrow(() -> new RuntimeException("Product not found"));
	}
	
	public void deleteProduct(Long id) {
		if (!productRepository.existsById(id)) {
            throw new RuntimeException("Product Not Found with id: " + id);
        }
		productRepository.deleteById(id);
	}
}

