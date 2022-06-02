/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod;

import factorymethod.Modelo.DB;

/**
 *
 * @author LVECKER
 */
public abstract class DBFactory {

    /**
     *
     * @return 
     */
   public DB orderDB() {
DB device = null;
device = CriandoBanco();
device.GetConection();

return device;

   } 
   protected abstract DB CriandoBanco();
}

   
    
   