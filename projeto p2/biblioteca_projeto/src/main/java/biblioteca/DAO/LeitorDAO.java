package biblioteca.DAO;

import biblioteca.classes.Leitor;
import java.sql.*;

public class LeitorDAO {

    public void salvar(Leitor leitor) throws SQLException {

        String sql =
            "INSERT INTO leitor(nome, cpf, telefone, email) VALUES (?, ?, ?, ?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, leitor.getNome());
            stmt.setString(2, leitor.getCpf());
            stmt.setString(3, leitor.getTelefone());
            stmt.setString(4, leitor.getEmail());

            stmt.executeUpdate();
        }
    }
}
