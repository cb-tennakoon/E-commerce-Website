package com.example.ECommerceWebsite.service;

import com.example.ECommerceWebsite.model.Product;
import com.example.ECommerceWebsite.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

//    List<Product> Prod_list = new ArrayList<>(Arrays.asList(new Product(1,"Pen",20),new Product(2,"Book",200)));

    public List<Product> getProduct(){
        return productRepo.findAll();
    }
    public Optional<Product> getProductById(int prodId){
//        return Prod_list.get(prodId);
        //return Prod_list.stream().filter(p->p.getProductId()==prodId).findFirst().orElseThrow();
        return productRepo.findById(prodId);
    }
    public void addProduct(Product prod){
        System.out.println(prod.toString());
        //Prod_list.add(prod);
        productRepo.save(prod);
    }

    public void updateProduct(Product product) {
//        int j = 0;
//        for(int i=0;i<Prod_list.size();i++){
//            if(Prod_list.get(i).getProductId()==product.getProductId()){
//                j=i;
//            }
//        }
        //System.out.println(j);
        //Prod_list.set(j,product);
        productRepo.save(product);
    }

    public void deleteProduct(int id) {
//        int j = 0;
//        for(int i=0;i<Prod_list.size();i++){
//            if(Prod_list.get(i).getProductId()==id){
//                j=i;
//            }
//        }
        //System.out.println(j);
       // Prod_list.remove(j);
        productRepo.deleteById(id);
    }
}
