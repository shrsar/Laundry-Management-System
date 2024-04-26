/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundrymgmt;

/**
 *
 * @author hp
 */
public class Services {
    String SID, C_TYPE, S_TYPE;
    int PPK, PRM;
    public Services(String SID, String C_TYPE, String S_TYPE, int PPK, int PRM){
        this.SID=SID;
        this.C_TYPE=C_TYPE;
        this.S_TYPE=S_TYPE;
        this.PPK=PPK;
        this.PRM=PRM;
        getSID();
        getC_TYPE();
        getS_TYPE();
        getPPK();
        getPRM();
    }
    
    public String getSID(){
        return SID;
    }
    
    public String getC_TYPE(){
        return C_TYPE;
    }
    
    public String getS_TYPE(){
        return S_TYPE;
    }
    
    public Integer getPPK(){
        return PPK;
    }
    
    public Integer getPRM(){
        return PRM;
    }
}
