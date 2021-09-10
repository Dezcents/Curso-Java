package comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Marcus";
        String nome2 = "Marcus";
        String nome3 = new String ("Marcus");
        String res;
        String res2;
        res = (nome1 == nome3)?"igual":"diferente";
        System.out.println(res);
        res2 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res2);
    }
    
}
