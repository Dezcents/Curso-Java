package idiomasistema;

import java.util.*;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("Seu sistma está em " + loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.language"));
    }
    
}
