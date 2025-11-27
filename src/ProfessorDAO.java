import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    private Connection conectar() throws Exception {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/seubanco",
                "root",
                "senha"
        );
    }

    // SALVAR
    public void salvar(Professor p) throws Exception {
        String sql = "INSERT INTO professor (nome, email, telefone, genero, salario, ativo) VALUES (?, ?, ?, ?, ?, ?)";

        Connection conn = conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getEmail());
        stmt.setString(3, p.getTelefone());
        stmt.setString(4, p.getGenero());
        stmt.setDouble(5, p.getSalario());
        stmt.setBoolean(6, p.isAtivo());

        stmt.execute();
        stmt.close();
        conn.close();
    }

    // LISTAR TODOS
    public List<Professor> listar() throws Exception {
        String sql = "SELECT * FROM professor WHERE data_remocao IS NULL";

        Connection conn = conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Professor> lista = new ArrayList<>();

        while (rs.next()) {
            Professor p = new Professor();

            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setEmail(rs.getString("email"));
            p.setTelefone(rs.getString("telefone"));
            p.setGenero(rs.getString("genero"));
            p.setSalario(rs.getDouble("salario"));
            p.setAtivo(rs.getBoolean("ativo"));
            p.setDataCadastro(rs.getString("data_cadastro"));
            p.setDataAtualizacao(rs.getString("data_atualizacao"));
            p.setDataRemocao(rs.getString("data_remocao"));

            lista.add(p);
        }

        rs.close();
        stmt.close();
        conn.close();

        return lista;
    }

    // ATUALIZAR
    public void atualizar(Professor p) throws Exception {
        String sql = "UPDATE professor SET nome=?, email=?, telefone=?, genero=?, salario=?, ativo=? WHERE id=?";

        Connection conn = conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getEmail());
        stmt.setString(3, p.getTelefone());
        stmt.setString(4, p.getGenero());
        stmt.setDouble(5, p.getSalario());
        stmt.setBoolean(6, p.isAtivo());
        stmt.setInt(7, p.getId());

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    // REMOVER (LÓGICO)
    public void remover(int id) throws Exception {
        String sql = "UPDATE professor SET data_remocao = NOW() WHERE id = ?";

        Connection conn = conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}

