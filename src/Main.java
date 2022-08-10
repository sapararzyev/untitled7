public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic(300, 30, "вип");
        Medic medic = new Medic(400, 40, "geektech");
        Warrior warrior = new Warrior(700, 50, "Dell");
        HavingSuperAbility[] havingSuperAbilities = {magic,medic,warrior};
        for (int i = 0; i <havingSuperAbilities.length ; i++) {
            havingSuperAbilities[i].applySuperAbility("superSupesobnostt");

        }



    }

}