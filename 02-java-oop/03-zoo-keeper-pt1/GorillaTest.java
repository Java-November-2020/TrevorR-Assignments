public class GorillaTest {
    public static void main(String[] args) {
        Gorilla energy = new Gorilla(100);
        for(int i = 0; i < 3; i ++){
            if(i < 1){
                energy.climb();
            }
            if (i < 2){
                energy.eatBananas();
            }
            if (i < 3){
                energy.throwSomething();
            }
        }
    }
}
