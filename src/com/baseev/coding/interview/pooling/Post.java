package com.baseev.coding.interview.pooling;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

import util.Data;
import util.User;

public final class Post
{
    
    private static PoolingHttpClientConnectionManager connManager = null;
    private static CloseableHttpClient httpClient = null;
   
    static {
        connManager = new PoolingHttpClientConnectionManager();
        httpClient = HttpClients.custom().setConnectionManager(connManager).build();
    }
        

    public static void makePostRequest(String url, byte[] bytes) throws IOException {
        HttpPost post = new HttpPost(url);
        ByteArrayEntity entity = new ByteArrayEntity(bytes);
        post.setEntity(entity);
        post.setHeader("Content-Type", "application/json");
        CloseableHttpResponse response = httpClient.execute(post);
        EntityUtils.consume(response.getEntity());
        response.close();
    }

    public static void closeHttpClientConnection() throws IOException {
        httpClient.close();
    }
    
    public static void shutdownConnectionManager() {
        connManager.close();
        connManager.shutdown();
    }

    
    private static byte[] getJson() throws Exception {
        User user = new User();
        
        Data preData = new Data();
        Data postData = new Data();
        
        preData.setFirstName("Baseev");
        preData.setLastName("Kumar");
        
        postData.setFirstName("Ishaan");
        postData.setLastName("Baseev");
        
        user.setIdUser(100);
        user.setIdgroup(500);
        user.setSource(2345);
        user.setPreData(preData);
        user.setPostData(postData);
        
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsBytes(user);
    }
    
    
    public void sendPost() throws Exception {
        String urlString = "http://localhost:8080/eventQueue/publishContactEvent";
        Post.makePostRequest(urlString, getJson());                
    }
    
    
    public static void main(String[] args)
    {
        
        Post p = new Post();
        try {
            p.sendPost();
            System.out.println("Successfully sent the request.");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }      

    }
}
