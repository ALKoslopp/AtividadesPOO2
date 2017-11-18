package Conexao;

import Domain.Voo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Adlan
 */
public class VooDao {
    private Connection connection;
    private Conexao conexao;
    
    public VooDao(){
        conexao = new Conexao();
        this.connection = conexao.abrir();
    }

    public void salva(Voo v1) {
    	String sql = ("INSERT INTO voos(idVoo)VALUES(?)");
    	PreparedStatement stmt;
	
	try {
            stmt = connection.prepareStatement(sql);
		
            stmt.setInt(1, v1.getId());
		
            stmt.executeUpdate();
					
	} catch (SQLException ex) {
            ex.printStackTrace();
			
	} finally {
            conexao.fechar();
	}		
    }
    
}
