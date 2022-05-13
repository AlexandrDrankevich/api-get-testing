import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebCamsOceanDriversTest extends AbstractTest {

    @Test
    public void testGetWebCams() {
        String url = "http://api.oceandrivers.com/v1.0/getWebCams/";
        String name = "Cala Agulla";
        String key = "name";
        client.sendGet(url);
        assertEquals(200, client.getStatusCode());
        client.getBody();
        assertTrue(client.<String>getListBodyValuesByKey(key).contains(name));
    }
}


