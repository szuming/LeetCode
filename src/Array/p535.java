package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * 长url转为短url
 */
public class p535 {
    //数据量小时可用HashMap储存key_value,key为自增Integer，value对应的就是原url，当数据量很大时则用mysql的自增字段id来代替HashMap
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
