package one.dio.experts.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products")
public class Product {
    
    @Id
    private long id;
    private String name;
    private int amount;

    public Product() {}

    public Product(long id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
