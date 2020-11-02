public class StringManipulatorTest {
    public static void main(String[] args) {
    String st= StringManipulator.TrimAndConcat(" Hello  ","  World ");
    System.out.println(st);

    char letter = 'o';
    Integer a = StringManipulator.GetIndexOrNull("Coding", letter);
    Integer b = StringManipulator.GetIndexOrNull("Hello World", letter);
    Integer c = StringManipulator.GetIndexOrNull("Hi", letter);
    System.out.println(a); 
    System.out.println(b); 
    System.out.println(c);
    
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer d = StringManipulator.IndexOrNull(word, subString);
    Integer e = StringManipulator.IndexOrNull(word, notSubString);
    System.out.println(d);
    System.out.println(e);

    String word2 = StringManipulator.ConcatSubstring("Hello", 1, 2, "world");
    System.out.println(word2);
    }
}


