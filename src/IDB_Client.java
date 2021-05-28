import java.sql.SQLException;
import java.util.Collection;

public interface IDB_Client {
    Collection<ProductDescription> loadCatalog() throws SQLException;
}
