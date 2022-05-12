import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetWebCamsOceanDrivers {
    private final String NAME = "Cala Agulla";
    private final String KEY = "name";

    @Test
    public void testGetWebCams() throws IOException {
        HttpGet request = new HttpGet("http://api.oceandrivers.com/v1.0/getWebCams/");
        CloseableHttpResponse response = HttpClientBuilder.create().build().execute(request);
        String entity = EntityUtils.toString(response.getEntity());
        JSONArray jsonArray = new JSONArray(entity);
        List<String> namesList = new ArrayList<>();
        for (Object jsonObject : jsonArray) {
            namesList.add(((JSONObject) jsonObject).getString(KEY));
        }
        assertEquals(200, response.getStatusLine().getStatusCode());
        assertTrue(namesList.contains(NAME));
    }
}


