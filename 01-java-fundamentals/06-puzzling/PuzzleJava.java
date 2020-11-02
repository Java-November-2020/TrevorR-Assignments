import java.util.Random;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PuzzleJava{
    public static void main(String[] args) {
        int[] numbers = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"));
            // System.out.println(SortNum());
            RandomArray();
    }
    public static ArrayList<Integer> AddingNumbers(int[] arr) {
        int sum = 0;
        ArrayList<Integer> greater = new ArrayList<Integer>();
        for(int i =0; i < arr.length; i++ ) {
            sum = sum + arr[i];
            if (arr[i]> 10){
                greater.add(arr[i]);
            }
        }
        System.out.println(sum);
        return greater;
    }
    public static ArrayList<String> ShuffleNames(ArrayList<String> arr) {
        ArrayList<String> greaterNames = new ArrayList<String>();
        Collections.shuffle(arr);
        System.out.println(arr);
        for(int i =0; i < arr.size(); i++ ){
            if (arr.get(i).length() > 5){
                greaterNames.add(arr.get(i));
            }
        }
        return greaterNames;
    } 
    public static void ShuffleAlphabet(){
        String[] vowels = {"a", "e", "i","o","u"};
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char az = 'a' ; az <= 'z' ; ++az) {
            alphabet.add(az);
        }
        Collections.shuffle(alphabet);
        System.out.println(alphabet.get(25));
        System.out.println(alphabet.get(0));
        if(Arrays.asList(vowels).contains(alphabet.get(0).toString())){
            System.out.println("Its a Vowel!");
        }
    }
    public static ArrayList<Integer> RandomNum() {
        Random r = new Random();
        r.nextInt(100);
        ArrayList<Integer> random = new ArrayList<Integer>();
        while(random.size()< 10){
            int randomNumber = r.nextInt(100);
            if (randomNumber > 55){
                random.add(randomNumber);
            }
        }
        return random;
    }
    public static ArrayList<Integer> SortNum() {
        Random r = new Random();
        r.nextInt(100);
        ArrayList<Integer> random = new ArrayList<Integer>();
        while(random.size()< 10){
            int randomNumber = r.nextInt(100);
            if (randomNumber > 55){
                random.add(randomNumber);
            }
        }
        Collections.sort(random);
        int currMax = random.get(0);
        int currMin = random.get(0);
        for(int i =0; i < random.size(); i ++) {
            if(currMax < random.get(i)){
                currMax = random.get(i);
            }
            else if(currMin > random.get(i)){
                currMin = random.get(i);
            }
        }
            System.out.println( random +" Max: " + currMax + " Min: " +currMin);
        return random;
        
    }
    public static void RandomString(){
        Random r = new Random();
        String rando = "";
        for (int i = 1; i <=5; i++){
        Character c = (char)(r.nextInt(26) + 'a');
        rando += c;
        }
        System.out.println(rando);
    }
    public static void RandomArray(){
        ArrayList<String> newArray = new ArrayList<String>();
        while(newArray.size() < 10){
            Random r = new Random();
            String rando = "";
            for (int i = 1; i <=5; i++){
                Character c = (char)(r.nextInt(26) + 'a');
                rando += c;
            }
            newArray.add(rando);
        }
        System.out.println(newArray);
    }
}


