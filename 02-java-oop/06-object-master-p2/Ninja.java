public class Ninja extends Human{
    int ninjaStealth = 10;

    public void steal(Human attacked){
        attacked.health -= this.ninjaStealth;
    }
    public void runAway(){
        this.health -= 10;
    }
}
