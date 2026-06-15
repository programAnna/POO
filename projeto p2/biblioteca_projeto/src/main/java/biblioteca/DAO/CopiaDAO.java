package biblioteca.DAO;

import biblioteca.classes.Copia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CopiaDAO {

    public void salvar(Copia copia) throws SQLException {

        String sql =
                "INSERT INTO copia(tombo, titulo) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, copia.getTombo());
            stmt.setString(2, copia.getObra().getTitulo());

            stmt.executeUpdate();
        }
    }
}
