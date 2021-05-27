import java.util.Collection;
import java.util.HashMap;

public class ProductCatalog {
    private HashMap<String,ProductDescription> descriptions = new HashMap<>();

    public ProductDescription getProductDesc(String id){
        return descriptions.get(id);
    }
    public ProductCatalog(){
        loadCatalog();
    }
    private void loadCatalog(){
        String[][] testInput = {{"001","香蕉"},{"002","梨子"},{"003","苹果"}};
        for(String[] s:testInput)
            descriptions.put(s[0],new ProductDescription(s[0],s[1],2.5));
    }

    public Collection<ProductDescription> getProductsCollection() {
        return descriptions.values();
    }

}
