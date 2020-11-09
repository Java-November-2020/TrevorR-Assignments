public class Samurai extends Human {
    int samuraiHealth = 200;
    int numberSamurai = 1;

    public void deathBlow(Human attacked){
        attacked.health = 0;
        this.health = health/2;
    }
    public void meditate(){
    this.health = samuraiHealth;
    }
    public int howMany(){
        return numberSamurai;
    }
}
