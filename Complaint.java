/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laundrymgmt;

/**
 *
 * @author hp
 */
public class Complaint {
    String UID, TID, DESCRPT, IMG, PHN, STS;
    public Complaint(String UID, String TID, String DESCRPT, String IMG, String PHN){
        this.UID=UID;
        this.TID=TID;
        this.DESCRPT=DESCRPT;
        this.IMG=IMG;
        this.PHN=PHN;
        this.STS=STS;
        getUID();
        getTID();
        getDESCRPT();
        getIMG();
        getPHN();
    }
    
    public String getUID(){
        return UID;
    }
    
    public String getTID(){
        return TID;
    }
    
    public String getDESCRPT(){
        return DESCRPT;
    }
    
    public String getIMG(){
        return IMG;
    }
    
    public String getPHN(){
        return PHN;
    }
}
