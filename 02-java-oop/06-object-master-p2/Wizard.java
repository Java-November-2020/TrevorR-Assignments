public class Wizard extends Human{
    int wizardHealth = 50;
    int wizardIntelligence = 8;

    public void heal(Human healing){
        healing.health += this.wizardIntelligence;
    }
    public void fireball(Human attacked){
        attacked.health -= (3 * this.wizardIntelligence);
    }
}
