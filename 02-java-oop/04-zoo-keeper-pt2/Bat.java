public class Bat{
    int energyLevel = 300;

    public void fly(){
        System.out.println("flap flap flap");
        energyLevel -= 50;
    }
    public void eatHumans(){
        energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("My Leg!!");
        energyLevel -= 100;
    }

}