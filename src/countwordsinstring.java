import java.util.Scanner;

public class countwordsinstring {
    public static String Input ( String str){
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public static void main(String[] args) {
        String line = Input("enter the sentence");
        String s[]= line.split(" ");
        System.out.println(" totoal no of words are: " +s.length);
    }
}
