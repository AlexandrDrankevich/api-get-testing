import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetWebCamsOceanDrivers {
    @Test
    public void testGetWebCams() throws IOException {
        HttpGet request=new HttpGet("http://api.oceandrivers.com/v1.0/getWebCams/");
        CloseableHttpResponse response = HttpClientBuilder.create().build().execute(request);
        assertEquals(200, response.getStatusLine().getStatusCode());
        System.out.println(EntityUtils.toString(response.getEntity()));



    }

}
