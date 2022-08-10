public class Magic extends Hero{
    public Magic(int health, int damage, String superSupesobnostt) {
        super(health, damage, superSupesobnostt);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("межик приминил суперспособность CRITICAL DEMAGE");

    }
}
