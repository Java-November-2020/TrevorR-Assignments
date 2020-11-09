public class Gorilla extends Mammal {

    public Gorilla(int energyLevel){
    super(energyLevel);
    }
    public void throwSomething(){
        System.out.println("Gorilla Throwing");
        energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println("Eating Bananas");
        energyLevel += 10;
    }
    public void climb(){
        System.out.println("Climbing");
        energyLevel -= 10;
    }

}