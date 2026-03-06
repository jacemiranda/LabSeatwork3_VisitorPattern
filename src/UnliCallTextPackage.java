import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static Map<String, String> unliMap = new HashMap<>();

    static {
        unliMap.put("Smart", "not offer any free calls or texts, and you will be charged per use.");
        unliMap.put("Globe", "unlimited calls and texts within network. Others charged extra.");
        unliMap.put("Ditto", "unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliMap.get(telcoName);
    }
}
