public class IntegerToString {
    public static void main(String[] args) {
        int i = 10;

        // Integer.toString()
        String s = Integer.toString(i);
        System.out.println(s);

        // String.valueOf()
        i = 1234;
        s = String.valueOf(i);
        System.out.println(s);

        // String.format("%d", int )

        i = 7865;
        s = String.format("%d",i);
        System.out.println(s);
    }
}
