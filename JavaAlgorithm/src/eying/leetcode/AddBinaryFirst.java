package eying.leetcode;

public class AddBinaryFirst {
    public static String addBinary(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 && j >= 0) {
            int digit = (a.charAt(i) - '0' + b.charAt(j) - '0') + carry;
            carry = digit / 2;
            digit = digit % 2;
            res.insert(0, digit);
            i--;
            j--;
        }

        while (j >= 0) {
            int digit = b.charAt(j) - '0' + carry;
            carry = digit / 2;
            digit = digit % 2;
            res.insert(0,digit);
            j--;
        }
        while (i >= 0) {
            int digit = b.charAt(i) - '0' + carry;
            carry = digit / 2;
            digit = digit % 2;
            res.insert(0,digit);
            i--;
        }
        if (carry>0){
            res.insert(0,carry);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = addBinary("100", "11");
        System.out.println(s);
    }
}
