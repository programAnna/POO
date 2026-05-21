package com.example.DAO;

import com.example.bean.Recepcionista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RecepcionistaDAO {

    private String url = "jdbc:sqlite:database.db";
    private Connection conexao;

    public RecepcionistaDAO() throws Exception {

        conexao = DriverManager.getConnection(url);

        String sql = """
            CREATE TABLE IF NOT EXISTS recepcionista (
                codigo INTEGER PRIMARY KEY AUTOINCREMENT,
                nome TEXT NOT NULL,
                telefone TEXT,
                turno TEXT
            )
            """;

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
    }

    // CREATE
    public void inserir(Recepcionista recepcionista) throws Exception {

        String sql =
                "INSERT INTO recepcionista(nome, telefone, turno) VALUES (?, ?, ?)";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setString(1, recepcionista.getNome());
        stmt.setString(2, recepcionista.getTelefone());
        stmt.setString(3, recepcionista.getTurno());

        stmt.execute();
    }

    // READ
    public Recepcionista consultar(int codigo) throws Exception {

        String sql =
                "SELECT * FROM recepcionista WHERE codigo = ?";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setInt(1, codigo);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            Recepcionista r = new Recepcionista();

            r.setCodigo(rs.getInt("codigo"));
            r.setNome(rs.getString("nome"));
            r.setTelefone(rs.getString("telefone"));
            r.setTurno(rs.getString("turno"));

            return r;
        }

        return null;
    }

    // UPDATE
    public void alterar(Recepcionista recepcionista) throws Exception {

        String sql =
                "UPDATE recepcionista SET nome=?, telefone=?, turno=? WHERE codigo=?";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setString(1, recepcionista.getNome());
        stmt.setString(2, recepcionista.getTelefone());
        stmt.setString(3, recepcionista.getTurno());
        stmt.setInt(4, recepcionista.getCodigo());

        stmt.execute();
    }

    // DELETE
    public void excluir(int codigo) throws Exception {

        String sql =
                "DELETE FROM recepcionista WHERE codigo=?";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setInt(1, codigo);

        stmt.execute();
    }
}
