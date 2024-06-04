package warehouse;
//Diese Klasse hilft zum Debuggen
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import warehouse.model.ProductData;

@Component
public class DatabaseInfoPrinter {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public DatabaseInfoPrinter(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void printDatabaseAndCollectionNames() {
        System.out.println("Database Name: " + mongoTemplate.getDb().getName());
        System.out.println("Collection Name: " + mongoTemplate.getCollectionName(ProductData.class));
    }
}