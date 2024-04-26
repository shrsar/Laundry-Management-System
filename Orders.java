/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laundrymgmt;
import java.sql.Date;
/**
 *
 * @author hp
 */
public class Orders{
    String UID, OID, SID, IMG, C_TYPE, S_TYPE, STS;
    int BILL;
    Date O_DATE, D_DATE;
    public Orders(String UID, String OID, String SID, Date O_DATE, Date D_DATE, int BILL, String IMG, String C_TYPE, String S_TYPE, String STS){
        this.UID=UID;
        this.OID=OID;
        this.SID=SID;
        this.O_DATE=O_DATE;
        this.D_DATE=D_DATE;
        this.BILL=BILL;
        this.IMG=IMG;
        this.C_TYPE=C_TYPE;
        this.S_TYPE=S_TYPE;
        this.STS=STS;
        getUID();
        getOID();
        getSID();
        getO_DATE();
        getD_DATE();
        getBILL();
        getIMG();
        getC_TYPE();
        getS_TYPE();
    }
    
    public String getOID(){
        return OID;
    }
    
    public String getUID(){
        return UID;
    }
    
    public String getSID(){
        return SID;
    }
    
    public Date getO_DATE(){
        return O_DATE;
    }
    
    public Date getD_DATE(){
        return D_DATE;
    }
    
    public int getBILL(){
        return BILL;
    }
    
    public String getIMG(){
        return IMG;
    }
    
    public String getC_TYPE(){
        return C_TYPE;
    }
    
    public String getS_TYPE(){
        return S_TYPE;
    }
}