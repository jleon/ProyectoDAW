/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FDI_Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class AdminFile {
    public static boolean isAdministrator(String user, String password, String adminFile){
        boolean result= false;
        FileReader fileReader = null;
        try {
            File aF= new File(adminFile);
            if(aF.exists()){
                fileReader = new FileReader(adminFile);
                BufferedReader bR= new BufferedReader(fileReader);
                String u= bR.readLine();
                String p= bR.readLine();
                if(user.equalsIgnoreCase(u) && password.equals(p)){
                    result= true;
                }
                fileReader.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
