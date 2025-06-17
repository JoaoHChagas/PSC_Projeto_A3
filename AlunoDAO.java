package tabelagui_a3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;

public class AlunoDAO {

  
    
    public void create(AlunosTabela p) {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO alunos (nome,nota_a1,nota_a2,nota_a3)VALUES(?,?,?,?)");
            stmt.setString(1,p.getNome());
            stmt.setInt(2,p.getNota_a1());
            stmt.setInt(3,p.getNota_a2());
            stmt.setInt(4,p.getNota_a3());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        } finally {
            conexao.closeConnection(con, stmt);
        }
    }

    public List<AlunosTabela> read() {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<AlunosTabela> tabelasA = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM alunos");
            rs = stmt.executeQuery();

            while (rs.next()) {
                AlunosTabela tabelaA = new AlunosTabela();

                tabelaA.setId(rs.getInt("id"));
                tabelaA.setNome(rs.getString("nome"));
                tabelaA.setNota_a1(rs.getInt("nota_a1"));
                tabelaA.setNota_a2(rs.getInt("nota_a2"));
                tabelaA.setNota_a3(rs.getInt("nota_a3"));
                tabelasA.add(tabelaA);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de listagem: "+ex);
        } finally {
            conexao.closeConnection(con, stmt, rs);
        }
        
        return tabelasA;
    }

    public void update(AlunosTabela p) {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE alunos SET nome = ?,nota_a1 = ?,nota_a2 = ?,nota_a3 = ? WHERE id = ?");
            stmt.setString(1,p.getNome());
            stmt.setInt(2,p.getNota_a1());
            stmt.setInt(3,p.getNota_a2());
            stmt.setInt(4,p.getNota_a3());
            stmt.setInt(5,p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        } finally {
            conexao.closeConnection(con, stmt);
        }
    }

    public void delete(AlunosTabela p) {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM alunos WHERE id = ?");
            stmt.setInt(1,p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ex);
        } finally {
            conexao.closeConnection(con, stmt);
        }
    }
    
    public List<AlunosTabela> listarTodosOsAlunos() {
        List<AlunosTabela> lista = new ArrayList<>();
        Connection con = conexao.getConnection();
        String sql = "SELECT * FROM alunos";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                AlunosTabela aluno = new AlunosTabela();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNota_a1(rs.getInt("nota_a1"));
                aluno.setNota_a2(rs.getInt("nota_a2"));
                aluno.setNota_a3(rs.getInt("nota_a3"));
                lista.add(aluno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

   
    public List<String> buscarFaltasPorAluno(int idAluno) {
        List<String> datas = new ArrayList<>();
        Connection con = conexao.getConnection();
        String sql = "SELECT data_falta FROM faltas WHERE id_aluno = ? ORDER BY data_falta";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, idAluno);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                datas.add(rs.getString("data_falta"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return datas;
    }

    
    public void inserirFalta(int idAluno, Date dataFalta) {
        Connection con = conexao.getConnection();
        String sql = "INSERT INTO faltas (id_aluno, data_falta) VALUES (?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, idAluno);
            stmt.setDate(2, dataFalta);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 
    public void excluirFalta(int idAluno, String dataFalta) {
        Connection con = conexao.getConnection();
        String sql = "DELETE FROM faltas WHERE id_aluno = ? AND data_falta = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, idAluno);
            stmt.setString(2, dataFalta); 
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
