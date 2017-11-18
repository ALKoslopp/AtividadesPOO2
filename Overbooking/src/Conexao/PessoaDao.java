package Conexao;

import Domain.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Adlan
 */
public class PessoaDao {
    private Connection connection;
    private Conexao conexao;
    
    public PessoaDao(){
        conexao = new Conexao();
        this.connection = conexao.abrir();
    }
	
    public void salva(Pessoa p1) {
    	String sql = ("INSERT INTO passageiros(nome, cpf, categoria, lugar)VALUES(?,?,?,?)");
    	PreparedStatement stmt;
	
	try {
            stmt = connection.prepareStatement(sql);
		
            stmt.setString(1, p1.getNome());
            stmt.setString(2, p1.getCpf());
            stmt.setString(3, p1.getCategoria().toString());
            stmt.setInt(4, p1.getLugar());
		
            stmt.executeUpdate();
					
	} catch (SQLException ex) {
            ex.printStackTrace();
			
	} finally {
            conexao.fechar();
	}		
    }
}
