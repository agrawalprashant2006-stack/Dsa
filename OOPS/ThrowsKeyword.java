import java.util.*;
public class ThrowsKeyword{
    public static void main(String[] args) {
        
    }
    public static void CEO() {
        System.out.println("CEO");
        manager();
    }
    public static void manager() {
        System.out.println("manager");
        teamLead();
    }
    public static void teamLead() {
        System.out.println("teamlead");
    }
}