public class FightTest {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        samurai.attack(ninja);
        wizard.heal(ninja);
        wizard.fireball(samurai);
        ninja.steal(wizard);
        ninja.runAway();
        samurai.deathBlow(wizard);
        samurai.meditate();
        System.out.println(samurai.howMany());
    }
}
