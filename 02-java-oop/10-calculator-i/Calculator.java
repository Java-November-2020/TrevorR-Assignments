public class Calculator{
    double operatorOne = 0;
    double operatorTwo = 0;
    char operation = ' ';
    double answer = 0;
    public Calculator(){
    }
    public void setOperatorOne(double opOne){
        this.operatorOne = opOne;
    }
    public void setOperatorTwo(double opTwo){
        this.operatorTwo = opTwo;
    }
    public void setOperation(char operator){
        this.operation = operator;
    }
    public void performOperation(){
        switch (operation){
            case '+': 
                answer = operatorOne + operatorTwo;
                break;
            case '-':
                answer = operatorOne - operatorTwo;
                break;
            default: break;
        }
    }
    public double getResults(){
        return answer;
    }
}
