/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import factorymethod.Modelo.DB;
import factorymethod.Modelo.PostgresDB;

/**
 *
 * @author LVECKER
 */
public class PostgresDBFactory extends DBFactory{

    @Override
    protected DB CriandoBanco() {
        System.out.println("Criando um banco postgres");
      return new PostgresDB();
    }

   
   
}
