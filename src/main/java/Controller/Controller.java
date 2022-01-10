package Controller;

import Exceptions.ExistingIdException;
import Models.Product;
import Repo.MemoryRepo;

public class Controller {

    private MemoryRepo memoryRepo;

    public Controller(MemoryRepo memoryRepo) {
        this.memoryRepo = memoryRepo;
    }

    public MemoryRepo getMemoryRepo() {
        return memoryRepo;
    }

    public void setMemoryRepo(MemoryRepo memoryRepo) {
        this.memoryRepo = memoryRepo;
    }

    /**
     * creates a product object for memoryRepo
     * @param id
     * @param price
     * @param sku
     * @param stock
     * @throws ExistingIdException
     */
    public void createProduct(int id,double price, String sku, int stock) throws ExistingIdException {
        Product product = new Product(id,price,sku,stock);
        memoryRepo.create(product);

    }

    /**
     * deletes a product object from memoryRepo by given id
     * @param id
     */
    public void deleteProduct(int id){
        memoryRepo.delete(id);
    }

    /**
     * updates a product object from memoryRepo with the same object id
     * @param id
     * @param price
     * @param sku
     * @param stock
     */
    public void updateProduct(int id,double price, String sku, int stock){
        Product product = new Product(id,price,sku,stock);
        memoryRepo.update(product);
    }

}
