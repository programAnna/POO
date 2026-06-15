package biblioteca.DAO;

import biblioteca.classes.Livro;
import java.sql.*;

public class LivroDAO {

    public void salvar(Livro livro) throws SQLException {

        String sql =
            "INSERT INTO livro(titulo, autor, ano, isbn) VALUES (?, ?, ?, ?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.setString(4, livro.getIsbn());

            stmt.executeUpdate();
        }
    }
}
