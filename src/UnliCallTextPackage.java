public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (telcoName.equals("Smart")) return "not offer any free calls or texts, and you will be charged per use.";
        if (telcoName.equals("Globe")) return "unlimited calls and texts within network. Others charged extra.";
        return "unlimited calls and texts to all networks within the country.";
    }
}