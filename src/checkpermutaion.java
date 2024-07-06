import java.util.Scanner;

public class checkpermutaion {

    public static boolean checkpermutaionn (String str1, String str2){
        if( str1.length()!= str2.length()){
            return false;
        }
        int [] frequency1 = new int[26];
        int [] frequency2 = new int[26];
        for ( int i =0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            frequency1[ch-'a']++;

        }
        for ( int i =0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            frequency2[ch-'a']++;
        }
        for ( int i =0; i<26; i++){
            if (frequency1[i]!= frequency2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string 1");
        String str1 = sc.nextLine();
        System.out.println("enter the string 2");
        String str2 = sc.nextLine();

        if( checkpermutaionn(str1,str2)){
            System.out.println("strings are permutaion of each other");
        } else {
            System.out.println("strings are not permutation of each other");
        }

    }
}
