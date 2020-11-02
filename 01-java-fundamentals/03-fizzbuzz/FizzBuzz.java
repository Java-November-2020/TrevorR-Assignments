public class FizzBuzz {

    public void FizzBuzzTesting() {
        for (int i = 1; i <= 50; i ++){
            String results = fizzbuzz(i);
            System.out.println("Input " + i + " Output " + results);
        }
    }
    public String fizzbuzz(int val) {
        if (val % 5 == 0 && val % 3 ==0){
            return "Fizzbuzz";
        } else if (val % 5 ==0) {
            return "Buzz";
        } else if (val % 3==0) {
            return "Fizz";
        } else {
            return Integer.toString(val);
        }
    }
}