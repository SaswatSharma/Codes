import java.util.*;
class Scope
{
    public static void main(String[] args) {
        String name="Saswat";
        {
            name="Sharma";
        }
        System.out.println(name);
    }
}