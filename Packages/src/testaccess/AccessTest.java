package testaccess;

import test.Foundation;

public class AccessTest {
    public static void main(String[] args) {
        Foundation foundation = new Foundation(1, 2, 3, 4);

        // Accessing variables
        // System.out.println(foundation.var1); // Not accessible (private)
        // System.out.println(foundation.var2); // Not accessible (default access)
        // System.out.println(foundation.var3); // Not accessible (protected)
        System.out.println(foundation.var4); // Accessible (public)
    }
}
