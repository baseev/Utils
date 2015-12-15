package com.baseev.coding.interview.util;
import java.util.LinkedHashMap;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * 
 */

/**
 * @author baseev
 *
 */


public class TestJson10 {
     
    public static void main(String[] args) {
        
        //String json = "{\"name\":\"baseev\",\"place\":\"bagalore\",\"messages\":[\"msg 1\",\"msg 2\",\"msg 3\"]}";
        String json = "{\"name\":\"baseev\",\"place\":\"bagalore\",\"messages\":[{\"msg 1\",\"msg 2\",\"msg 3\"}]}";

        
        Map<String,String> map = new LinkedHashMap<String,String>();
        
     
        try {
     
            //convert JSON string to Map
            ObjectMapper mapper = new ObjectMapper();
            map = mapper.readValue(json, new TypeReference<LinkedHashMap<String,Object>>(){});
     
            
            System.out.println(map);
     
        } catch (Exception e) {
            e.printStackTrace();
        }
     
        }
}
