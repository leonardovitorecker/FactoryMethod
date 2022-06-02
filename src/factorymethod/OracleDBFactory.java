/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import factorymethod.Modelo.DB;
import factorymethod.Modelo.OracleDB;

/**
 *
 * @author LVECKER
 */
public class OracleDBFactory extends DBFactory{
    
 
@Override
public DB CriandoBanco()
{
    System.out.println("Criando um banco oracle");
 return new OracleDB();
}
}
