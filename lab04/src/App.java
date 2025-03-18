import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://db.jzpeykazbckhpxdvqtnp.supabase.co:5432/postgres?user=postgres&password=[YOUR-PASSWORD]";
        ObjetoDados objDados = new ObjetoDados(url);
        List<Conta> contas = objDados.obterContas();
        for (Conta c: contas){
            System.out.println(c);
        }
    }
}