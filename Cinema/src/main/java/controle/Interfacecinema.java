/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controle;
import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Sala;
/**
 *
 * @author pedro
 */
public interface Interfacecinema extends Remote{
    public boolean inserir(Sala s)throws RemoteException;
    public boolean editar (Sala s)throws RemoteException;
    public boolean excluir (Sala s)throws RemoteException;
    public Sala selecionar (Sala s)throws RemoteException;
}
