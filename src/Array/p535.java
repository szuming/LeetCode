package Array;

import java.util.HashMap;
import java.util.Map;

public class p535 {
    Map<Integer,String> map=new HashMap<>();
    private int count=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(count,longUrl);
        return "http://tinyurl.com/"+count++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String countString[]=shortUrl.split("/");
        return map.get(Integer.valueOf(countString[countString.length-1]));
    }
}
