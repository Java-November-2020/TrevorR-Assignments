public class StringManipulator {
    public static String TrimAndConcat(String stringa, String stringb) {
        return stringa.trim().concat(stringb.trim());
    }
    public static Integer GetIndexOrNull(String input, char n) {
        return input.indexOf(n) != -1 ? input.indexOf(n) : null;
    }
    public static Integer IndexOrNull(String input1, String input2) {
        return input1.indexOf(input2) != -1 ? input1.indexOf(input2) : null;
    }
    public static String ConcatSubstring(String input, int a, int b, String replacement) {
        String substr = input.substring(a, b);
        return substr.concat(replacement);
    }
}