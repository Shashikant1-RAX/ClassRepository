public class StringBuilder1 {
    public static void main(String[] args) {
        //Reversing a string using stringbuilder in java. method 1.
        String str = "Hello";
        StringBuilder reverseStr = new StringBuilder(str);
//        reverseStr.reverse();
//        String str2 = reverseStr.toString();
//        System.out.println(str2);

        //Method 2.
        String sam = "Hello World";
        StringBuilder sb = new StringBuilder(sam);
        for(int i = 0; i<sb.length()/2; i++ ){
            int front = i;
            int back = sb.length() - i - 1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}
