package com.example.DAO;

import com.example.bean.Medico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MedicoDAO {

    private String url = "jdbc:sqlite:database.db";
    private Connection conexao;

    public MedicoDAO() throws Exception {

        conexao = DriverManager.getConnection(url);

        String sql = """
            CREATE TABLE IF NOT EXISTS medico (
                codigo INTEGER PRIMARY KEY AUTOINCREMENT,
                nome TEXT NOT NULL,
                especialidade TEXT NOT NULL,
                crm TEXT NOT NULL
            )
            """;

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
    }

    // CREATE
    public void inserir(Medico medico) throws Exception {

        String sql =
                "INSERT INTO medico(nome, especialidade, crm) VALUES (?, ?, ?)";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setString(1, medico.getNome());
        stmt.setString(2, medico.getEspecialidade());
        stmt.setString(3, medico.getCrm());

        stmt.execute();
    }

    // READ
    public Medico consultar(int codigo) throws Exception {

        String sql =
                "SELECT * FROM medico WHERE codigo = ?";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setInt(1, codigo);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            Medico medico = new Medico();

            medico.setCodigo(rs.getInt("codigo"));
            medico.setNome(rs.getString("nome"));
            medico.setEspecialidade(rs.getString("especialidade"));
            medico.setCrm(rs.getString("crm"));

            return medico;
        }

        return null;
    }

    // UPDATE
    public void alterar(Medico medico) throws Exception {

        String sql =
                "UPDATE medico SET nome=?, especialidade=?, crm=? WHERE codigo=?";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setString(1, medico.getNome());
        stmt.setString(2, medico.getEspecialidade());
        stmt.setString(3, medico.getCrm());
        stmt.setInt(4, medico.getCodigo());

        stmt.execute();
    }

    // DELETE
    public void excluir(int codigo) throws Exception {

        String sql =
                "DELETE FROM medico WHERE codigo=?";

        PreparedStatement stmt =
                conexao.prepareStatement(sql);

        stmt.setInt(1, codigo);

        stmt.execute();
    }
}
