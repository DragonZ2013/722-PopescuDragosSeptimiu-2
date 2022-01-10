package Repo;

import Exceptions.ExistingIdException;
import Exceptions.MissingIdException;
import Models.Product;

import java.util.List;

public class MemoryRepo {
    private List<Product> productList;

    public MemoryRepo(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


    public void create(Product product) throws ExistingIdException {
        for(Product existing:productList)
            if(existing.getId()==product.getId())
                throw new ExistingIdException("Object with given Id exists");
        productList.add(product);
    }

    public void update(Product product){
        Product productToUpdate = this.productList.stream()
                .filter(currentProduct -> currentProduct.getId() == product.getId())
                .findFirst()
                .orElseThrow();
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setSku(product.getSku());
        productToUpdate.setStock(product.getStock());

    }

    public void delete(int id){
        Product productToDelete = this.productList.stream()
                .filter(currentProduct -> currentProduct.getId() == id)
                .findFirst()
                .orElseThrow();
        this.productList.remove(productToDelete);
    }

    public List<Product> getAll(){
        return productList;
    }


}
