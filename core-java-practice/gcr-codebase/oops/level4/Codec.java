import java.util.HashMap;

public class Codec {
    private HashMap<String, String> map;
    private int counter;

    public Codec() {
        map = new HashMap<>();
        counter = 0;
    }

    public String encode(String longUrl) {
        String key = "http://tinyurl.com/" + counter++;
        map.put(key, longUrl);
        return key;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        String shortUrl = codec.encode("https://example.com/very/long/url/12345");
        System.out.println("Encoded: " + shortUrl);
        System.out.println("Decoded: " + codec.decode(shortUrl));
    }
}
