import java.util.*;

public class AuthenticationManager {
    private int timeToLive;
    private HashMap<String, Integer> tokens;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        tokens = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId) && tokens.get(tokenId) > currentTime) {
            tokens.put(tokenId, currentTime + timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (int expiry : tokens.values()) {
            if (expiry > currentTime) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        AuthenticationManager am = new AuthenticationManager(5);
        am.generate("tok1", 1);
        System.out.println(am.countUnexpiredTokens(3));
        am.generate("tok2", 2);
        System.out.println(am.countUnexpiredTokens(6));
        am.renew("tok1", 4);
        System.out.println(am.countUnexpiredTokens(6));
        am.renew("tok2", 10);
        System.out.println(am.countUnexpiredTokens(11));
    }
}
