import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String inputString = "abccbad";
        String result = "";
        Stack<String> reverseString = new Stack<>();
        String[] arrayString = inputString.split("");
        for (int i = arrayString.length-1; i >= 0; i--){
            reverseString.push(arrayString[i]);
        }
        for (int i = 0; i < reverseString.size(); i++){
            result += reverseString.get(i);
        }
        if (result.equals(inputString)){
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
