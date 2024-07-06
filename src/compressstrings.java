import java.util.Scanner;

public class compressstrings {
    public static String compressstring(String str){
        if(str==null|| str.length()==0){
            return str;
        }
        StringBuilder compressed = new StringBuilder();
        int count =1;
        for( int i =1; i<str.length(); i++){
            if(str.charAt(i)== str.charAt(i-1)){
                count++;
            }
            else{
                compressed.append(str.charAt(i-1));
                if(count>1){
                    compressed.append(count);
                }
                count=1;
            }

        }
        compressed.append(str.charAt(str.length()-1));
        if(count>=1){
            compressed.append(count);
        }
        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        System.out.println("compressed string is"+ compressstring(str));
    }
}
