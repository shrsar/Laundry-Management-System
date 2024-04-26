/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laundrymgmt;

/**
 *
 * @author hp
 */
public class Customers {
    String UID, U_NAME, PHONE;
    public Customers(String UID, String U_NAME, String PHONE){
        this.UID=UID;
        this.U_NAME=U_NAME;
        this.PHONE=PHONE;
        getUID();
        getU_NAME();
        getPHONE();
    }
    
    public String getUID(){
        return UID;
    }
    
    public String getU_NAME(){
        return U_NAME;
    }
    
    public String getPHONE(){
        return PHONE;
    }
}
