import client.BaseClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AbstractTest {
    BaseClient client;

    @BeforeEach
    public void getClient() {
        client = new BaseClient();
    }

    @AfterEach
    public void tearDownClient() {
        client.closeClient();
    }
}
