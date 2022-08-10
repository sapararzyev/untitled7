public class Medic extends Hero{
    public Medic(int health, int damage, String superSupesobnostt) {
        super(health, damage, superSupesobnostt);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" медик приминил суперспособность CRITICAL DEMAGE");
    }
}
