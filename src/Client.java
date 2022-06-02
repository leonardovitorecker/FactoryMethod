
import factorymethod.DBFactory;
import factorymethod.Modelo.DB;
import factorymethod.OracleDBFactory;
import factorymethod.PostgresDBFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LVECKER
 */
public class Client {
     
    public static void main(String[] args) {
      DBFactory OracleDBFactory=new OracleDBFactory();
     
      if(1!=1){
      
     DB db=OracleDBFactory.orderDB();
     System.out.println(db);
      }else{
      DBFactory PostgresDBFactory=new PostgresDBFactory();
      
       
     DB db1=PostgresDBFactory.orderDB();
     System.out.println(db1);}
    
    
    }

  

}
