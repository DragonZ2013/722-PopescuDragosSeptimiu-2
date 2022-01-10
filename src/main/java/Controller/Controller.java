package Controller;

import Exceptions.ExistingIdException;
import Models.Product;
import Repo.MemoryRepo;

public class Controller {
    /**
     * Crud operations
     * Current stock
     *
     */
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

    public void createProduct(int id,double price, String sku, int stock) throws ExistingIdException {
        Product product = new Product(id,price,sku,stock);
        memoryRepo.create(product);

    }

    public void deleteProduct(int id){
        memoryRepo.delete(id);
    }

    public void updateProduct(int id,double price, String sku, int stock){
        Product product = new Product(id,price,sku,stock);
        memoryRepo.update(product);
    }

}
