package biblioteca.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservaDAO {

    public void salvar(String usuario,
                       String obra)
            throws SQLException {

        String sql =
                "INSERT INTO reserva(usuario, obra) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, obra);

            stmt.executeUpdate();
        }
    }
}