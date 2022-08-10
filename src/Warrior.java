public class Warrior extends Hero{
    public Warrior(int health, int damage, String superSupesobnostt) {
        super(health, damage, superSupesobnostt);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" Warrior приминил суперспособность CRITICAL DEMAGE");
    }
}
