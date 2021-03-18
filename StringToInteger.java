import java.util.*;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        // Integer.parseInt()
        int i = Integer.parseInt(s);
        System.out.println(i);
        
        s = sc.nextLine();
        // Integer.valueOf()
        i = Integer.valueOf(s);
        System.out.println(i);
    }
}
