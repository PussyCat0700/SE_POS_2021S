import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DBManager implements IDB_Client{
    private Connection conn;
    DBManager(){
        conn = DBUtil.getConnection();
    }
    public void addProduct(ProductDescription pd){}

    public void delProduct(String id){}

    public void updateProduct(ProductDescription pd){}

    public ProductDescription getProduct(String id){return null;}
    public Collection<ProductDescription> loadCatalog() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM "+DBUtil.getProductDescription());
        HashSet<ProductDescription> pds = new HashSet<>();
        while(rs.next()){
            ProductDescription pd = new ProductDescription();
            pd.setID(rs.getString("id"));
            pd.setName(rs.getString("name"));
            pd.setPrice(rs.getDouble("price"));
            pds.add(pd);
        }
        return pds;
    }
}
