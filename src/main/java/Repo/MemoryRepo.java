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


    /**
     * adds a product object to productList
     * @param product
     * @throws ExistingIdException
     */
    public void create(Product product) throws ExistingIdException {
        for(Product existing:productList)
            if(existing.getId()==product.getId())
                throw new ExistingIdException("Object with given Id exists");
        productList.add(product);
    }

    /**
     * modifies a product object from productList with the same object id
     * @param product
     */
    public void update(Product product){
        Product productToUpdate = this.productList.stream()
                .filter(currentProduct -> currentProduct.getId() == product.getId())
                .findFirst()
                .orElseThrow();
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setSku(product.getSku());
        productToUpdate.setStock(product.getStock());

    }

    /**
     * removes a product object from, productList with the given Id if it exists
     * @param id
     */
    public void delete(int id){
        Product productToDelete = this.productList.stream()
                .filter(currentProduct -> currentProduct.getId() == id)
                .findFirst()
                .orElseThrow();
        this.productList.remove(productToDelete);
    }

    /**
     * returns the entire productList
     * @return
     */
    public List<Product> getAll(){
        return productList;
    }


}
