/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlle;
import Coneccao.Conectar;
import java.rmi.RemoteException;
import model.Sala;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class SalaController extends UnicastRemoteObject implements InterfaceCinema{
    public SalaController()throws  RemoteException{}
    @Override
    public boolean inserir(Sala s)throws RemoteException{
        boolean retorno = false;
        String sql = "insert into filme_id(id_filme) values(?)" ;
        String sql1 = "insert into filme(id_filme,nome_filme) values(?,?)" ;
        String sql2 = "insert into filme_id(id_filme,vagas,preco) values(?,?,?)" ;
        Conectar.conectar();
    try{
        PreparedStatement sentenca = Conectar.con.prepareStatement(sql);
        PreparedStatement sentenca1 = Conectar.con.prepareStatement(sql1);
        PreparedStatement sentenca2 = Conectar.con.prepareStatement(sql2);
        
        sentenca.setInt(1, s.getID_movie());
        
        sentenca1.setInt(1, s.getID_movie());
        sentenca1.setString(2, s.getName_movie());
        
        sentenca2.setInt(1, s.getID_movie());
        sentenca2.setInt(2, s.getVagas());
        sentenca2.setFloat(3, s.getPreco());
        if(!sentenca.execute()){
                retorno = true;
        }
        if(!sentenca1.execute()){
                retorno = true;
        }
        if(!sentenca2.execute()){
                retorno = true;
        }
    }catch(SQLException e){
            System.out.println(e.getMessage());
        } 
        Conectar.desconectar();
        return retorno;
    }
     @Override
    public boolean editar(Sala s) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Sala s) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sala selecionar(Sala s) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
