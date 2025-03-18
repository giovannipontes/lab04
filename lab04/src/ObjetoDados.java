import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ObjetoDados {
    private PreparedStatement obterContasStm = null;
    public ObjetoDados (String url) throws SQLException{
    Connection conexao = DriverManager.getConnection(url);
    obterContasStm = conexao.prepareStatement("SELECT * FROM contas");
    }
    public List<Conta> obterContas() throws SQLException {
        List<Conta> contas = new ArrayList<>();
        ResultSet rs = obterContasStm.executeQuery();
        while (rs.next()) {
            long numero = rs.getLong("nro_conta");
            double saldo = rs.getDouble("saldo");
            Conta c = new Conta(numero, saldo);
            contas.add(c);
        }
        return contas;
    }
}