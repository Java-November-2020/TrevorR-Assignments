import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("Hello");
            myList.add("world");
            myList.add("Goodbye");
            myList.add("World");
            try {
                for(int i = 0; i < myList.size(); i++) {
                    Integer castedValue = (Integer) myList.get(i);
                }
            } catch (Exception e) {
                System.out.println("It didn't work!");
            }
    }
}