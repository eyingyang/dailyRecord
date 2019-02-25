package eying.leetcode;

import java.util.ArrayList;

/* Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class AddBinaryEying {


    public static void main(String[] args) {
        String a = "111";
        String b = "001";


//        addBinary(a, b);
        String c = a;
        System.out.println(c);

    }

    private static String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        String maxString;
        int minLength;
        if(a.length()>=b.length()){
            maxString = a;
            minLength = b.length();
        }else{
            maxString = b;
            minLength = a.length();
        }
         int minus= a.length()-b.length();

        int preflag = 0;
            for (int i = minLength - 1; i >= 0; i--) {
            int temp = Integer.parseInt(a.charAt(i) + "");
            int temp1 = Integer.parseInt(b.charAt(i) + "");
            int res = temp1 + temp;
            sb.append((res+preflag)%2);
            if ((res+preflag) >= 2) {
                preflag = 1;
            } else {
                preflag = 0;  //<-
        }

        }


        return "";
    }
}
