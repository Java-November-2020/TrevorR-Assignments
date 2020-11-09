public class BatTest {
    public static void main(String[] args) {
        Bat tester = new Bat();
        for(int i = 0; i < 3; i++){
            if(i<3){
                tester.fly();
            }
            if(i<2){
                tester.eatHumans();
            }
            if(i<1){
                tester.attackTown();
            }
        }
    }
}
