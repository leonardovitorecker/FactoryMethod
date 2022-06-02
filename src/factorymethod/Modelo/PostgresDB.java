/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.Modelo;

/**
 *
 * @author LVECKER
 */
public class PostgresDB extends DB{

    @Override
    public void GetConection() {
      System.out.println("Criando conexao postgres");
    }
    
}
