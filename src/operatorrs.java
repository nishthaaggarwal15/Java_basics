public class operatorrs {
    public static void main (String [] args){
//        System.out.println( 64>8 && 69<8);
//        System.out.println( 64 > 5 || 65>55);
//        int a = 45;
//        String b = "45";
////        System.out.println( a+b);
//        int a = 4;
//        int b = 5;
//        int c= 6;
////        int k= (b*b)-(4*a*c)/(2*a);
////        System.out.println(k);
//        System.out.println(b++);
//        System.out.println(b);
//        System.out.println(++b);
//        System.out.println(b);
//
//        System.out.println(a--);
//        System.out.println(a);
//        System.out.println(--a);
//        System.out.println(a);
//        int y= 7;
//        int x= ++y*8;
//        int z= y++*8;
//        System.out.println(x);
//        System.out.println(z);
//        char v = 'b';
//        System.out.println(v++);

        byte a = 126;

        // byte is 8 bit value
        System.out.println(a);

        a++;
        System.out.println(a);

        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);

        // Looping back within the range
        a++;
        System.out.println(a);



    }
}
