import java.util.*;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting:");
        String str = sc.next();
        System.out.println("Enter the character you want to search for:");
        char ser = sc.next().charAt(0);
        System.out.println(search(str,ser));
    }
    static boolean search(String str,char ser)
    {
        for(char i:str.toCharArray()) {
            if (i == ser)
                return true;
        }
        return false;
    }
}
