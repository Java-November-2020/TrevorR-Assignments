public class CalculatorTest {
    public static void main(String[] args) {
        Calculator plus = new Calculator();
        plus.setOperatorOne(10.5);
        plus.setOperation('-');
        plus.setOperatorTwo(5.2);
        plus.performOperation();
        System.out.println(plus.getResults());
    }
}
