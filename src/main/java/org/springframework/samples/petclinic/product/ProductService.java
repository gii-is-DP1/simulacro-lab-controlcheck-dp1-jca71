package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
    public List<Product> getAllProducts(){
        List<Product> p = productRepository.findAll();
        return p;
    }
    
    public ProductType getProductType(String nombre) {
    	ProductType tipoProducto = productRepository.findProductType(nombre);
    	return tipoProducto;
    }

    public List<Product> getProductsCheaperThan(double price) {
        return productRepository.findByPriceLessThan(price);
    }

    public List<ProductType> getAllProductTypes() {
        return productRepository.findAllProductTypes();       
    }

    public Product save(Product p){
        return productRepository.save(p);       
    }

    
}
