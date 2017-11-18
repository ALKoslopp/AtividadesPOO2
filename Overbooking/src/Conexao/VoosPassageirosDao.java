package Conexao;

import Domain.Pessoa;
import Domain.Voo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Adlan
 */
public class VoosPassageirosDao {
    private Connection connection;
    private Conexao conexao;
    private int pessoa;
    private int voo;
    private Voo Ivoo;
    private Pessoa Ipessoa;
    
    public VoosPassageirosDao(){
        pessoa();
        voo();
    }
    
    public void pessoa(){
        String sql = ("select id from passageiros where " +  " ' " + Ipessoa.getNome() + " ' " + " = id");
        PreparedStatement stmt;
	
	try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
			
            while(rs.next()) {				
                this.pessoa = rs.getInt("id");
            }
					
            } catch (SQLException ex) {
		ex.printStackTrace();
			
              //} finally {
               // conexao.fechar();
              //}
    }
    
    public void voo(){
        String sql = ("select id from voos where id = " + " ' " + Ivoo.geraId() + "'");
        PreparedStatement stmt;
	
	try {
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
			
            while(rs.next()) {				
                this.voo = rs.getInt("id");
            }
					
            } catch (SQLException ex) {
		ex.printStackTrace();
			
              //} finally {
                //conexao.fechar();
             // }
    }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int idPessoa) {
        this.pessoa = idPessoa;
    }

    public int getVoo() {
        return voo;
    }

    public void setVoo(int idVoo) {
        this.voo = idVoo;
    }
    
    public void salva() {
    	String sql = ("INSERT INTO voopassageiros(idVoo, idPassageiros)VALUES(?,?)");
    	PreparedStatement stmt;
	
	try {
            stmt = connection.prepareStatement(sql);
		
            stmt.setInt(1, getPessoa());
            stmt.setInt(2, getVoo());
		
            stmt.executeUpdate();
					
	} catch (SQLException ex) {
            ex.printStackTrace();
			
	} finally {
            conexao.fechar();
	}		
    }
    
}
