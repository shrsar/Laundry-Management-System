/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laundrymgmt;

/**
 *
 * @author hp
 */
public class DataPass {
    private static final DataPass instance=new DataPass();
    
    private String uid, phone, otp;
    private long bill, ppk, prm, ddays;
    private int qty, flg=0;
    
    private DataPass(){}
    
    public static DataPass getInstance(){
        return instance;
    }
    
    public int getflg(){
        return flg;
    }
    
    public void setflg(int flg){
        this.flg=flg;
    }
    
    public String getotp(){
        return otp;
    }
    
    public String getphone(){
        return phone;
    }
    
    public String getuid(){
        return uid;
    }
    
    public long getbill(){
        return bill;
    }
    
    public long getppk(){
        return ppk;
    }
    
    public long getprm(){
        return prm;
    }
    
    public long getddays(){
        return ddays;
    }
    
    public long getqty(){
        return qty;
    }
    
    public void setotp(String otp){
        this.otp=otp;
    }
    
    public void setphone(String phone){
        this.phone=phone;
    }
    
    public void setuid(String uid){
        this.uid=uid;
    }
    
    public void setbill(long bill){
        this.bill=bill;
    }
    
    public void setppk(long ppk){
        this.ppk=ppk;
    }
    
    public void setprm(long prm){
        this.prm=prm;
    }
    
    public void setddays(long ddays){
        this.ddays=ddays;
    }
    
    public void setqty(int qty){
        this.qty=qty;
    }
}
