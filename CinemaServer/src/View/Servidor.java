/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controlle.InterfaceCinema;
import Controlle.SalaController;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author pedro
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.createRegistry(1500);
            System.out.println("Servidor Iniciado!");
            InterfaceCinema servicocinema = new SalaController();
            registro.bind("cinema", servicocinema);
            //InterfaceVenda servicoVenda = new VendaController();
            //registro.bind("venda", servicoVenda);
        } catch (RemoteException ex) {
            System.out.println("Erro na conexao! "+ ex.getMessage());
        } catch (AlreadyBoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
