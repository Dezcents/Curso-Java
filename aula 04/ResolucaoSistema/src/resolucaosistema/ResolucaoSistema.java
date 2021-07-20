package resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
//import java.util.*;

public class ResolucaoSistema {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Sua tela tem resolução: " + d.width + " x " + 
                            d.height);
        
    }
    
}
