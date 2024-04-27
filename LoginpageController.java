/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package laundrymgmt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import java.util.Base64;
import java.util.Random;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class LoginpageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AreaChart<?, ?> tocchart;
    
    @FXML
    private LineChart<?, ?> toochart;
    
    @FXML
    private BarChart<?, ?> incchart;
    
    @FXML
    private Label toc;
    
    @FXML
    private Label too;
    
    @FXML
    private Label todinc;
    
    @FXML
    private Label toinc;
    
    @FXML
    private TextField otpval;
    
    @FXML
    private TextField ordrqty;
    
    @FXML
    private ImageView trackimg;
    
    @FXML
    private ImageView custcmpimg;
    
    @FXML
    private TextField imgoid;
    
    @FXML
    private Label initxt;
    
    @FXML
    private Button custrefbtn;
    
    @FXML
    private Button condreadbtn;
    
    @FXML
    private ImageView custordrimg;
    
    @FXML
    private Button odrbtn;
    
    @FXML
    private Button loginbtn;
    
    @FXML
    private Button custflecmpbtn;
    
    @FXML
    private Button exitbtn;
    
    @FXML
    private TextField sid;
    
    @FXML
    private TextField pkg;
    
    @FXML
    private TextField seckey;
    
    @FXML
    private TextField prm;
    
    @FXML
    private TextField usrnm;
    
    @FXML
    private PasswordField pswd;
    
    @FXML
    private TextField sgnup_usrnm;
    
    @FXML
    private PasswordField sgnup_pswd;
    
    @FXML
    private TextField uid1;
    
    @FXML
    private TextField cstid;
    
    @FXML
    private Label custbill;
    
    @FXML
    private Label welcid;
    
    @FXML
    private TextField npswd;
    
    @FXML
    private DatePicker custpkdate;
    
    @FXML
    private Button dashboardbtn;
    
    @FXML
    private Button custbtn;
    
     @FXML
    private Button custrackbtn;
     
    @FXML
    private Button custordrbtn;
    
    @FXML
    private ComboBox<?> svs_type;
    
    @FXML
    private ComboBox<?> clth_type;
    
    @FXML
    private Button srvcsbtn;
    
    @FXML
    private Button readbtn;
    
    @FXML
    private Button srvcsrefbtn;
    
    @FXML
    private Button trackrefbtn;
    
    @FXML
    private Button custseesrvbtn;
    
    @FXML
    private Button viewcmpbtn;
    
    @FXML
    private AnchorPane custseesrvpane;
    
    @FXML
    private AnchorPane odrpane;
    
    @FXML
    private AnchorPane custordrpane;
    
    @FXML
    private AnchorPane custrackpane;
    
    @FXML
    private AnchorPane dashboardpane;
    
    @FXML
    private AnchorPane custpane;
    
    @FXML
    private AnchorPane srvcspane;
    
    @FXML
    private AnchorPane custflecmpane;
    
    @FXML
    private AnchorPane cmpane;
    
    @FXML
    private AnchorPane welcimgpane;
    
    @FXML
    private TableColumn<Services, String> srvt_sid;
    
    @FXML
    private TableColumn<Services, String> srvt_ctype;
    
    @FXML
    private TableColumn<Services, String> srvt_srv;
    
    @FXML
    private TableColumn<Services, Integer> srvt_pce;
    
    @FXML
    private TableColumn<Services, Integer> srvt_prm;
    
    @FXML
    private TableView<Services> srvcs_table;
    
    @FXML
    private TableView<Orders> ordr_table;
    
    @FXML
    private TableView<Customers> cust_table;
    
    @FXML
    private TableView<Orders> track_table;
    
    @FXML
    private TableView<Complaint> cmptable;
    
    @FXML
    private TableColumn<?, ?> cust_usrnm;
    
    @FXML
    private TableColumn<?, ?> cust_phn;
    
    @FXML
    private TableColumn<?, ?> cust_id;
    
    @FXML
    private TableColumn<Orders, String> ordr_oid;
    
    @FXML
    private TableColumn<?, ?> ordr_odate;
    
    @FXML
    private TableColumn<?, ?> ordr_ddate;
    
    @FXML
    private TableColumn<?, ?> ordr_inc;
    
    @FXML
    private TableColumn<?, ?> ordr_uid;
    
    @FXML
    private TableColumn<?, ?> ordr_sid;
    
    @FXML
    private TableColumn<?, ?> track_odate;
    
    @FXML
    private TableColumn<?, ?> track_oid;
    
    @FXML
    private TableColumn<?, ?> track_ctype;
    
    @FXML
    private TableColumn<?, ?> track_stype;
    
    @FXML
    private TableColumn<?, ?> track_ddate;
    
    @FXML
    private TableColumn<?, ?> track_bill;
    
    @FXML
    private TableColumn<?, ?> cmpuid;
    
    @FXML
    private TableColumn<?, ?> cmpcid;
    
    @FXML
    private TableColumn<?, ?> cmphn;
    
    @FXML
    private Button showbillbtn;
    
    @FXML
    private TextField phone;
    
    @FXML
    private TextField tid;
    
    @FXML
    private TextArea descrpt;
    
    @FXML
    private TextArea cmpstmnt;
    
    @FXML
    private ImageView prfimg;
    
    private Image img;
    private Alert alert;
    
    private final String[] servicesList={"Washing", "Washing and Ironing", "Ironing"};
    private final String[] clothesList={"Everyday use", "Cotton", "Wool", "Silk", "Worsted", "Satin"};
    
    public int chkphnOnAction(String temp) throws Exception{
        int flag=0;
        if(temp.length()!=10){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Not a valid phone number!");
            alert.showAndWait();
        }
        else{
            flag=1;
        }
        return flag;
    }
    
    public int chkpswdOnAction(String temp) throws Exception{
        int flag=0;
        if(temp.isBlank()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Field empty!");
            alert.showAndWait();
        }
        else{
            if(temp.length()<6){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Insufficient length!");
                alert.showAndWait();
            }
            else{
                int uc=0, lc=0, spc=0, nc=0;
                for(int i=0;i<temp.length();i++){
                    if(Character.isLowerCase(temp.charAt(i))){
                        lc=1;
                    }
                    else if(Character.isUpperCase(temp.charAt(i))){
                        uc=1;
                    }
                    else if(Character.isDigit(temp.charAt(i))){
                        nc=1;
                    }
                    else{
                        spc=1;
                    }
                }
                if(uc==1 && lc==1 && spc==1 && nc==1){
                    flag=1;
                }
                else{
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Retry!");
                    alert.showAndWait();
                }
            }
        }
        return flag;
    }
    
    public void sendotpbtnOnAction() throws Exception{
        String uid=uid1.getText(), pswd=npswd.getText(), skey=seckey.getText(), phn="", sk="";
        String url1="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="SELECT * FROM LOGIN WHERE UID='"+uid+"';";
        int otp=-1;
        try{
            Connection conn=DriverManager.getConnection(url1, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                phn=rs.getString("PHONE");
                sk=rs.getString("SECKEY");
            }
            if(phn.equals("") || uid.isBlank() || pswd.isBlank() || skey.isBlank() || !sk.equals(skey)){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Credentials!");
                alert.showAndWait();
            }
            else{
                String myURI = "https://api.bulksms.com/v1/messages";

                // change these values to match your own account
                String myUsername = "sskr";
                String myPassword = "1234";

                Random random=new Random();
                int min=100000;
                int max=999999;
                otp=random.nextInt((max-min)+min);
                phn="+91"+phn;
                // the details of the message we want to send
                String myData = "{to: \"" + phn + "\", body: \"Your App code is:" + otp + "\"}";

                // if your message does not contain unicode, the "encoding" is not required:
                // String myData = "{to: \"1111111\", body: \"Hello Mr. Smith!\"}";

                // build the request based on the supplied settings
                URL url = new URL(myURI);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.setDoOutput(true);

                // supply the credentials
                String authStr = myUsername + ":" + myPassword;
                String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
                request.setRequestProperty("Authorization", "Basic " + authEncoded);

                // we want to use HTTP POST
                request.setRequestMethod("POST");
                request.setRequestProperty( "Content-Type", "application/json");

                // write the data to the request
                OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
                out.write(myData);
                out.close();

                // try ... catch to handle errors nicely
                try {
                  // make the call to the API
                  InputStream response = request.getInputStream();
                  BufferedReader in = new BufferedReader(new InputStreamReader(response));
                  String replyText;
                  while ((replyText = in.readLine()) != null) {
                    System.out.println(replyText);
                  }
                  in.close();
                } catch (IOException ex) {
                  System.out.println("An error occurred:" + ex.getMessage());
                  BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
                  // print the detail that comes with the error
                  String replyText;
                  while ((replyText = in.readLine()) != null) {
                    System.out.println(replyText);
                  }
                  in.close();
                }
                request.disconnect();
                    }
            DataPass dp=DataPass.getInstance();
            dp.setotp(Integer.toString(otp));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void sendotpbtnOnAction1() throws Exception{
        DataPass dp=DataPass.getInstance();
        String phn=dp.getphone();
                int otp=-1;
                String myURI = "https://api.bulksms.com/v1/messages";

                // change these values to match your own account
                String myUsername = "sskr";
                String myPassword = "1234";

                Random random=new Random();
                int min=100000;
                int max=999999;
                otp=random.nextInt((max-min)+min);
                phn="+91"+phn;
                // the details of the message we want to send
                String myData = "{to: \"" + phn + "\", body: \"Your App code is:" + otp + "\"}";
                dp.setotp(Integer.toString(otp));

                // if your message does not contain unicode, the "encoding" is not required:
                // String myData = "{to: \"1111111\", body: \"Hello Mr. Smith!\"}";

                // build the request based on the supplied settings
                URL url = new URL(myURI);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.setDoOutput(true);

                // supply the credentials
                String authStr = myUsername + ":" + myPassword;
                String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
                request.setRequestProperty("Authorization", "Basic " + authEncoded);

                // we want to use HTTP POST
                request.setRequestMethod("POST");
                request.setRequestProperty( "Content-Type", "application/json");

                // write the data to the request
                OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
                out.write(myData);
                out.close();

                // try ... catch to handle errors nicely
                try {
                  // make the call to the API
                  InputStream response = request.getInputStream();
                  BufferedReader in = new BufferedReader(new InputStreamReader(response));
                  String replyText;
                  while ((replyText = in.readLine()) != null) {
                    System.out.println(replyText);
                  }
                  in.close();
                } catch (IOException ex) {
                  System.out.println("An error occurred:" + ex.getMessage());
                  BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
                  // print the detail that comes with the error
                  String replyText;
                  while ((replyText = in.readLine()) != null) {
                    System.out.println(replyText);
                  }
                  in.close();
                }
                request.disconnect();
    }
    
    public void displaylinechart(){
        toochart.getData().clear();
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="SELECT O_DATE, COUNT(OID) FROM ORDERS GROUP BY O_DATE;";
        try{
            XYChart.Series chart=new XYChart.Series<>();
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                chart.getData().add(new XYChart.Data<>(rs.getString(1), rs.getInt(2)));
            }
            toochart.getData().add(chart);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void displaybarchart(){
        incchart.getData().clear();
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="SELECT O_DATE, SUM(BILL) FROM ORDERS GROUP BY O_DATE;";
        try{
            XYChart.Series chart=new XYChart.Series<>();
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                chart.getData().add(new XYChart.Data<>(rs.getString(1), rs.getInt(2)));
            }
            incchart.getData().add(chart);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void displayareachart(){
        tocchart.getData().clear();
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="SELECT SGN_DATE, COUNT(UID) FROM LOGIN GROUP BY SGN_DATE;";
        try{
            XYChart.Series chart=new XYChart.Series<>();
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                chart.getData().add(new XYChart.Data<>(rs.getString(1), rs.getInt(2)));
            }
            tocchart.getData().add(chart);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void showbillbtnOnAction(ActionEvent e) throws Exception{
        if(e.getSource()==showbillbtn){
            DataPass dp=DataPass.getInstance();
            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Bill Message!");
            alert.setHeaderText(null);
            alert.setContentText("Bill: "+dp.getbill()+", Price per cloth: "+dp.getppk()+" and Premium(in case you want the order within 5 days): "+dp.getprm());
            alert.showAndWait();
        }
    }
    
    public void displaydashbrd(){
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query1="SELECT COUNT(UID) FROM LOGIN;";
        String query2="SELECT COUNT(OID) FROM ORDERS;";
        String query3="SELECT SUM(BILL) FROM ORDERS WHERE O_DATE='"+java.sql.Date.valueOf(java.time.LocalDate.now())+"';";
        String query4="SELECT SUM(BILL) FROM ORDERS";
        try{
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps1, ps2, ps3, ps4;
            ps1=conn.prepareStatement(query1);
            ps2=conn.prepareStatement(query2);
            ps3=conn.prepareStatement(query3);
            ps4=conn.prepareStatement(query4);
            ResultSet rs1, rs2, rs3, rs4;
            rs1=ps1.executeQuery();
            rs2=ps2.executeQuery();
            rs3=ps3.executeQuery();
            rs4=ps4.executeQuery();
            while(rs1.next()){
                toc.setText(rs1.getString(1));
            }
            while(rs2.next()){
                too.setText(rs2.getString(1));
            }
            while(rs3.next()){
                todinc.setText(rs3.getString(1));
            }
            while(rs4.next()){
                toinc.setText(rs4.getString(1));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void servicesServiceList(){
        List<String> listS=new ArrayList<>();
        for(String data:servicesList){
            listS.add(data);
        }
        ObservableList listData=FXCollections.observableArrayList(listS);
        svs_type.setItems(listData);
    }
    
    public void servicesClothList(){
        List<String> listS=new ArrayList<>();
        for(String data:clothesList){
            listS.add(data);
        }
        ObservableList listData=FXCollections.observableArrayList(listS);
        clth_type.setItems(listData);
    }
    
    public ObservableList<Complaint> complaintslist(){
        String query="SELECT * FROM COMPLAINT";
        ObservableList<Complaint> listData=FXCollections.observableArrayList();
        try{
            String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
            String mysqlusr="root";
            String mysqlpwd="1234";
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Complaint cmpt;
            String sts="";
            while(rs.next()){
                sts=rs.getString("STS");
                if(sts.equals("T")){
                    cmpt=new Complaint(rs.getString("UID"), rs.getString("TID"), rs.getString("DESCRPT"), rs.getString("IMG"), rs.getString("PHN"));
                    listData.add(cmpt);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return listData;
    }
    
    private ObservableList<Complaint> complaintslistdata;
    
    public void complaintsshowdata(){
        complaintslistdata=complaintslist();
        cmpuid.setCellValueFactory(new PropertyValueFactory<>("UID"));
        cmpcid.setCellValueFactory(new PropertyValueFactory<>("TID"));
        cmphn.setCellValueFactory(new PropertyValueFactory<>("PHN"));
        cmptable.setItems(complaintslistdata);
    } 
    
    public ObservableList<Customers> customerslist(){
        String query="SELECT UID, U_NAME, PHONE FROM LOGIN";
        ObservableList<Customers> listData=FXCollections.observableArrayList();
        try{
            String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
            String mysqlusr="root";
            String mysqlpwd="1234";
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Customers csts;
            while(rs.next()){
                csts=new Customers(rs.getString("UID"), rs.getString("U_NAME"), rs.getString("PHONE"));
                listData.add(csts);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return listData;
    }
    
    private ObservableList<Customers> customerslistdata;
    
    public void customersshowdata(){
        customerslistdata=customerslist();
        cust_usrnm.setCellValueFactory(new PropertyValueFactory<>("U_NAME"));
        cust_id.setCellValueFactory(new PropertyValueFactory<>("UID"));
        cust_phn.setCellValueFactory(new PropertyValueFactory<>("PHONE"));
        cust_table.setItems(customerslistdata);
    }
    
    public ObservableList<Orders> ordersList(){
        String query="SELECT UID, OID, SID, O_DATE, D_DATE, BILL, IMG, C_TYPE, S_TYPE, STS FROM ORDERS";
        ObservableList<Orders> listData=FXCollections.observableArrayList();
        try{
            String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
            String mysqlusr="root";
            String mysqlpwd="1234";
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Orders ods;
            String sts;
            while(rs.next()){
                ods=new Orders(rs.getString("UID"), rs.getString("OID"), rs.getString("SID"), rs.getDate("O_DATE"), rs.getDate("D_DATE"), rs.getInt("BILL"), rs.getString("IMG"), rs.getString("C_TYPE"), rs.getString("S_TYPE"), rs.getString("STS"));
                listData.add(ods);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return listData;
    }
    
    private ObservableList<Orders> orderslistdata;
    
    public void ordersshowdata(){
        orderslistdata=ordersList();
        ordr_oid.setCellValueFactory(new PropertyValueFactory<>("OID"));
        ordr_uid.setCellValueFactory(new PropertyValueFactory<>("UID"));
        ordr_sid.setCellValueFactory(new PropertyValueFactory<>("SID"));
        ordr_odate.setCellValueFactory(new PropertyValueFactory<>("O_DATE"));
        ordr_ddate.setCellValueFactory(new PropertyValueFactory<>("D_DATE"));
        ordr_inc.setCellValueFactory(new PropertyValueFactory<>("BILL"));
        ordr_table.setItems(orderslistdata);
    }
    
    public ObservableList<Orders> trackList(){
        DataPass dp=DataPass.getInstance();
        String query="SELECT UID, OID, SID, O_DATE, D_DATE, BILL, IMG, C_TYPE, S_TYPE, STS FROM ORDERS WHERE UID='"+dp.getuid()+"';";
        ObservableList<Orders> listData=FXCollections.observableArrayList();
        try{
            String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
            String mysqlusr="root";
            String mysqlpwd="1234";
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Orders ods;
            String sts;
            while(rs.next()){
                sts=rs.getString("STS");
                if(sts.equals("T")){
                    ods=new Orders(rs.getString("UID"), rs.getString("OID"), rs.getString("SID"), rs.getDate("O_DATE"), rs.getDate("D_DATE"), rs.getInt("BILL"), rs.getString("IMG"), rs.getString("C_TYPE"), rs.getString("S_TYPE"), rs.getString("STS"));
                    listData.add(ods);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return listData;
    }
    
    private ObservableList<Orders> tracklistdata;
    
    public void trackshowdata(){
        tracklistdata=trackList();
        track_oid.setCellValueFactory(new PropertyValueFactory<>("OID"));
        track_ctype.setCellValueFactory(new PropertyValueFactory<>("C_TYPE"));
        track_stype.setCellValueFactory(new PropertyValueFactory<>("S_TYPE"));
        track_odate.setCellValueFactory(new PropertyValueFactory<>("O_DATE"));
        track_ddate.setCellValueFactory(new PropertyValueFactory<>("D_DATE"));
        track_bill.setCellValueFactory(new PropertyValueFactory<>("BILL"));
        track_table.setItems(tracklistdata);
    }
    
    public void custimprbtnOnAction(){
        FileChooser open=new FileChooser();
        File file=open.showOpenDialog(custordrpane.getScene().getWindow());
        if(file!=null){
            data.path=file.getAbsolutePath();
            img=new Image(file.toURI().toString(), 175, 141, false, true);
            custordrimg.setImage(img);
        }
    }
    
    public void custimprcmpbtnOnAction(){
        FileChooser open=new FileChooser();
        File file=open.showOpenDialog(custflecmpane.getScene().getWindow());
        if(file!=null){
            data.path=file.getAbsolutePath();
            img=new Image(file.toURI().toString(), 200, 200, false, true);
            custcmpimg.setImage(img);
        }
    }
    
    public void custcmpbtnOnAction() throws Exception{
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="INSERT INTO COMPLAINT VALUES(?, ?, ?, ?, ?, ?)";
        String cnt_query="SELECT COUNT(*) FROM COMPLAINT";
        String tid="";
        try{
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps;
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(cnt_query);
            while(rs.next()){
                tid=Integer.toString(rs.getInt(1)+1);
            }
            tid="T"+tid;
            DataPass dp=DataPass.getInstance();
            String uid=dp.getuid();
            if(descrpt.getText().isBlank()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Write a description!");
                alert.showAndWait();
            }
            else{
                ps=conn.prepareStatement(query);
                ps.setString(1, uid);
                ps.setString(2, tid);
                ps.setString(3, descrpt.getText());
                String path=data.path;
                path=path.replace("\\", "\\\\");
                ps.setString(4, path);
                ps.setString(5, dp.getphone());
                ps.setString(6, "T");
                ps.execute();
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Your ticket is: "+tid+"!");
                alert.showAndWait();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void custordrbtnOnAction() throws Exception{
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="INSERT INTO ORDERS VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String cnt_query="SELECT COUNT(*) FROM ORDERS";
        String c_type=(String)clth_type.getSelectionModel().getSelectedItem();
        String s_type=(String)svs_type.getSelectionModel().getSelectedItem();
        String s_query="SELECT * FROM SERVICES WHERE C_TYPE='"+c_type+"' AND S_TYPE='"+s_type+"';";
        String oid="", sid="";
        DataPass dp=DataPass.getInstance();
        try{
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps;
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(cnt_query);
            while(rs.next()){
                oid=Integer.toString(rs.getInt(1)+1);
            }
            ps=conn.prepareStatement(s_query);
            rs=ps.executeQuery();
            long bill=0, price=0, premium=0;
            while(rs.next()){
                sid=rs.getString("SID");
                price=rs.getInt("PPK");
                premium=rs.getInt("PRM");
            }
            if(sid.equals("")){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Service doesn't exist!");
                alert.showAndWait();
            }
            else{
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/DD");
                LocalDateTime now = LocalDateTime.now();
                java.time.LocalDate date1 = java.time.LocalDate.now();
                java.time.LocalDate date2 = custpkdate.getValue();
                long differenceInDays = java.time.temporal.ChronoUnit.DAYS.between(date1, date2);
                if(differenceInDays<0){
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Invalid date!");
                    alert.showAndWait();
                }
                else{
                    if(differenceInDays>=0 && differenceInDays<=5){
                        bill+=(5-differenceInDays)*premium;
                    }
                    oid='O'+oid;
                    ps=conn.prepareStatement(query);
                    if(cstid.getText().equals("") || ordrqty.getText().equals("")){
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Field(s) missing!");
                        alert.showAndWait();
                    }
                    else{
                        if(cstid.getText().equals(dp.getotp())){
                            bill=bill+price*Integer.parseInt(ordrqty.getText());
                            dp.setbill(bill);
                            dp.setppk(price);
                            dp.setprm(premium);
                            custbill.setText(Long.toString(bill));
                            ps.setString(1, dp.getuid());
                            ps.setString(2, oid);
                            ps.setString(3, sid);
                            ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
                            ps.setDate(5, java.sql.Date.valueOf(custpkdate.getValue()));
                            ps.setLong(6, bill);
                            String path=data.path;
                            path=path.replace("\\", "\\\\");
                            ps.setString(7, path);
                            ps.setString(8, c_type);
                            ps.setString(9, s_type);
                            ps.setString(10, "T");
                            ps.execute();
                            alert = new Alert(AlertType.INFORMATION);
                            alert.setTitle("Information Message");
                            alert.setHeaderText(null);
                            alert.setContentText("Your order ID: "+oid+"!");
                            alert.showAndWait();
                        }
                        else{
                            alert = new Alert(AlertType.ERROR);
                            alert.setTitle("Error Message");
                            alert.setHeaderText(null);
                            alert.setContentText("Wrong OTP!");
                            alert.showAndWait();
                        }
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void trackrcvbtnOnAction() throws Exception{
        if(imgoid.getText().isBlank()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Empty Field!");
            alert.showAndWait();
        }
        else{
            DataPass dp=DataPass.getInstance();
            String oid=imgoid.getText();
            String uid=dp.getuid();
            try{
                String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
                String mysqlusr="root";
                String mysqlpwd="1234";
                Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
                String query="SELECT STS FROM ORDERS WHERE OID='"+oid+"' AND UID='"+uid+"';";
                PreparedStatement ps=conn.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
                int flag=0;
                String status="";
                while(rs.next()){
                    status=rs.getString("STS");
                    flag=1;
                }
                if(flag==0 || status.equals("F")){
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong entries!");
                    alert.showAndWait();
                }
                else{
                    query="UPDATE ORDERS SET STS='F' WHERE OID='"+oid+"';";
                    Statement stmnt=conn.createStatement();
                    stmnt.executeUpdate(query);
                    trackshowdata();
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Received!");
                    alert.showAndWait();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void showimgbtnOnAction() throws Exception{
        if(imgoid.getText().isBlank()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Empty Field!");
            alert.showAndWait();
        }
        else{
            DataPass dp=DataPass.getInstance();
            String oid=imgoid.getText();
            String uid=dp.getuid();
            try{
                String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
                String mysqlusr="root";
                String mysqlpwd="1234";
                Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
                String query="SELECT IMG, STS FROM ORDERS WHERE OID='"+oid+"' AND UID='"+uid+"';";
                PreparedStatement ps=conn.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
                int flag=0;
                String path="", sts="";
                while(rs.next()){
                    sts=rs.getString("STS");
                    path="File:"+rs.getString("IMG");
                    flag=1;
                }
                if(flag==0 || sts.equals("F")){
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong entries!");
                    alert.showAndWait();
                }
                else{
                    Image image=new Image(path, 175, 141, false, true);
                    trackimg.setImage(image);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void showcmpdetailsbtnOnAction() throws Exception{
        if(tid.getText().isBlank()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Empty Field!");
            alert.showAndWait();
        }
        else{
            String oid=tid.getText();
            try{
                String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
                String mysqlusr="root";
                String mysqlpwd="1234";
                Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
                String query="SELECT IMG, DESCRPT, STS FROM COMPLAINT WHERE TID='"+oid+"';";
                PreparedStatement ps=conn.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
                int flag=0;
                String path="", sts="", dscrpt="";
                while(rs.next()){
                    sts=rs.getString("STS");
                    path="File:"+rs.getString("IMG");
                    dscrpt=rs.getString("DESCRPT");
                    flag=1;
                }
                if(flag==0 || sts.equals("F")){
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong entries!");
                    alert.showAndWait();
                }
                else{
                    cmpstmnt.setWrapText(true);
                    cmpstmnt.setText(dscrpt);
                    Image image=new Image(path, 200, 200, false, true);
                    prfimg.setImage(image);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public ObservableList<Services> serviceList(){
        String query="SELECT SID, C_TYPE, S_TYPE, PPK, PRM FROM SERVICES";
        ObservableList<Services> listData=FXCollections.observableArrayList();
        try{
            String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
            String mysqlusr="root";
            String mysqlpwd="1234";
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Services sv;
            while(rs.next()){
                sv=new Services(rs.getString("SID"), rs.getString("C_TYPE"), rs.getString("S_TYPE"), rs.getInt("PPK"), rs.getInt("PRM"));
                listData.add(sv);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return listData;
    }
    
    private ObservableList<Services> serviceslistdata;
    
    public void servicesshowdata(){
        serviceslistdata=serviceList();
        srvt_sid.setCellValueFactory(new PropertyValueFactory<>("SID"));
        srvt_ctype.setCellValueFactory(new PropertyValueFactory<>("C_TYPE"));
        srvt_srv.setCellValueFactory(new PropertyValueFactory<>("S_TYPE"));
        srvt_pce.setCellValueFactory(new PropertyValueFactory<>("PPK"));
        srvt_prm.setCellValueFactory(new PropertyValueFactory<>("PRM"));
        srvcs_table.setItems(serviceslistdata);
    }
    
    public void srvcsinsbtnOnAction() throws Exception{
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="INSERT INTO SERVICES VALUES(?, ?, ?, ?, ?)";
        try{
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, sid.getText());
            ps.setString(2, (String)clth_type.getSelectionModel().getSelectedItem());
            ps.setString(3, (String)svs_type.getSelectionModel().getSelectedItem());
            ps.setInt(4, Integer.parseInt(pkg.getText()));
            ps.setInt(5, Integer.parseInt(prm.getText()));
            ps.execute();
            servicesshowdata();
            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Service Added!");
            alert.showAndWait();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void srvcsdelbtnOnAction() throws Exception{
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String checkquery="UPDATE SERVICES SET SID='"+sid.getText()+"' WHERE SID='"+sid.getText()+"';";
        String query="DELETE FROM SERVICES WHERE SID='"+sid.getText()+"';";
        try{
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            Statement stmnt=conn.createStatement();
            int rows=stmnt.executeUpdate(checkquery);
            if(rows>0){
                stmnt.executeUpdate(query);
                servicesshowdata();
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Service deleted!");
                alert.showAndWait();
            }
            else{
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Service doesn't exist!");
                alert.showAndWait();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void srvcsupdtbtnOnAction() throws Exception{
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String checkquery="UPDATE SERVICES SET SID='"+sid.getText()+"' WHERE SID='"+sid.getText()+"';";
        try{
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            Statement stmnt=conn.createStatement();
            int rows=stmnt.executeUpdate(checkquery);
            String query;
            int flag=0;
            if(rows>0){
                if(!pkg.getText().isBlank() && prm.getText().isBlank())
                {
                    int temp=Integer.parseInt(pkg.getText());
                    query="UPDATE SERVICES SET PPK="+temp+" WHERE SID='"+sid.getText()+"';";
                    stmnt.executeUpdate(query);
                    flag=1;
                    servicesshowdata();
                }
                else if(!prm.getText().isBlank() && pkg.getText().isBlank())
                {
                    int temp=Integer.parseInt(prm.getText());
                    query="UPDATE SERVICES SET PRM="+temp+" WHERE SID='"+sid.getText()+"';";
                    stmnt.executeUpdate(query);
                    flag=1;
                    servicesshowdata();
                }
                else if(!pkg.getText().isBlank() && !prm.getText().isBlank()){
                    int temp1, temp2;
                    temp1=Integer.parseInt(pkg.getText());
                    temp2=Integer.parseInt(prm.getText());
                    query="UPDATE SERVICES SET PPK="+temp1+" , PRM="+temp2+" WHERE SID='"+sid.getText()+"';";
                    stmnt.executeUpdate(query);
                    flag=1;
                    servicesshowdata();
                }
                else{
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Empty Field(s)!");
                    alert.showAndWait();
                }
                if(flag==1){
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Update Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Updated!");
                    alert.showAndWait();
                }
            }
            else{
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Service doesn't exist!");
                alert.showAndWait();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void resolvebtnOnAction() throws Exception{
        if(tid.getText().isBlank()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Empty Field!");
            alert.showAndWait();
        }
        else{
            String oid=tid.getText();
            try{
                String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
                String mysqlusr="root";
                String mysqlpwd="1234";
                Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
                String query="SELECT STS FROM COMPLAINT WHERE TID='"+oid+"';";
                PreparedStatement ps=conn.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
                int flag=0;
                String status="";
                while(rs.next()){
                    status=rs.getString("STS");
                    flag=1;
                }
                if(flag==0 || status.equals("F")){
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong entries!");
                    alert.showAndWait();
                }
                else{
                    query="UPDATE COMPLAINT SET STS='F' WHERE TID='"+oid+"';";
                    Statement stmnt=conn.createStatement();
                    stmnt.executeUpdate(query);
                    complaintsshowdata();
                    prfimg.setImage(null);
                    cmpstmnt.setText("");
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Resolved!");
                    alert.showAndWait();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void loginpagesignupbtnOnAction() throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("signup.fxml"));
        Stage stage=new Stage();
        Scene scene=new Scene(root);
        stage.setMaxWidth(1200);
        stage.setMaxHeight(800);
        stage.setScene(scene);
        stage.show();
    }
    
    public void readbtnOnAction(ActionEvent e) throws Exception{
        if(e.getSource()==readbtn){
            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Security key can be your first school name, your favourite book, etc!");
            alert.showAndWait();
        }
    }
    
    public void condreadbtnOnAction(ActionEvent e) throws Exception{
        if(e.getSource()==condreadbtn){
            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Password must be of atleast 6 characters and \nmust've an uppercase character, a lowercase character, \na special character and a digit");
            alert.showAndWait();
        }
    }
    
    public void signupbtnOnAction(ActionEvent e) throws Exception{
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="INSERT INTO LOGIN VALUES(?, ?, ?, ?, ?, ?)";
        String chk_query="SELECT PHONE FROM LOGIN";
        String cnt_query="SELECT COUNT(*) FROM LOGIN";
        String uname=sgnup_usrnm.getText();
        String psw=sgnup_pswd.getText();
        String phn=phone.getText();
        if(uname.isBlank() || psw.isBlank() || phn.isBlank()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Field(s) Empty!");
            alert.showAndWait();
        }
        else{
            DataPass dp=DataPass.getInstance();
                String uid="";
                try{
                    Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
                    PreparedStatement stm=conn.prepareStatement(chk_query);;
                    Statement stmt;
                    ResultSet rs;
                    if(sgnup_pswd.getText().toLowerCase().equals("admin123")){
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Use another password!");
                        alert.showAndWait();
                    }
                    else{
                        String temp="";
                        rs=stm.executeQuery();
                        int flag=0;
                        while(rs.next()){
                            temp=rs.getString("PHONE");
                            if(temp.equals(phn)){
                                flag=1;
                                break;
                            }
                        }
                        if(flag==0){
                            stmt=conn.createStatement();
                            rs=stmt.executeQuery(cnt_query);
                            while(rs.next()){
                                uid=Integer.toString(rs.getInt(1)+1);
                            }
                            uid='U'+uid;
                            if(uname.isBlank() || psw.isBlank() || seckey.getText().isBlank() || phone.getText().isBlank() || chkpswdOnAction(sgnup_pswd.getText())==0 || chkphnOnAction(phone.getText())==0){
                                alert = new Alert(AlertType.ERROR);
                                alert.setTitle("Error Message");
                                alert.setHeaderText(null);
                                alert.setContentText("Field(s) missing!");
                                alert.showAndWait();
                            }
                            else{
                                stm=conn.prepareCall(query);
                                stm.setString(1, uname);
                                stm.setString(2, uid);
                                stm.setString(3, psw);
                                stm.setString(4, seckey.getText());
                                stm.setDate(5, java.sql.Date.valueOf(java.time.LocalDate.now()));
                                stm.setString(6, phn);
                                stm.execute();
                                alert = new Alert(AlertType.INFORMATION);
                                alert.setTitle("Information Message");
                                alert.setHeaderText(null);
                                alert.setContentText("Your UID is: "+uid+" and you have signed up!");
                                alert.showAndWait();
                            }
                        }
                        else{
                            alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error Message");
                            alert.setHeaderText(null);
                            alert.setContentText("Phone number exists!");
                            alert.showAndWait();
                        }
                    }
                }
                catch(Exception x){
                    x.printStackTrace();
                }
            }
    }
    
    public void exitbtnOnAction(ActionEvent e) throws Exception{
        Stage stage=(Stage)exitbtn.getScene().getWindow();
        stage.close();
        Parent root=FXMLLoader.load(getClass().getResource("loginpage.fxml"));
        Scene scene=new Scene(root);
        stage.setMaxWidth(1000);
        stage.setMaxHeight(805);
        stage.setScene(scene);
        stage.show();
    }
    
    public void loginbtnOnAction(ActionEvent e) throws Exception{
        if(usrnm.getText().isBlank() || pswd.getText().isBlank()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Empty Field(s)!");
            alert.showAndWait();
        }
        else{
            if(usrnm.getText().equals("admin") && pswd.getText().equals("admin123")){
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successful Admin Login!");
                alert.showAndWait();
                Parent root=FXMLLoader.load(getClass().getResource("admin.fxml"));
                Stage stage=new Stage();
                Scene scene=new Scene(root);
                stage.setMaxWidth(1210);
                stage.setMaxHeight(750);
                stage.setScene(scene);
                stage.show();
                stage.setTitle("Laundry Management System");
                loginbtn.getScene().getWindow().hide();
            }
            else if(usrnm.getText().equals("admin") && !pswd.getText().equals("admin123")){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Wrong Credentials!");
                alert.showAndWait();
            }
            else{
                String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
                String mysqlusr="root";
                String mysqlpwd="1234";
                String chk_query="UPDATE LOGIN SET UID='"+usrnm.getText()+"' WHERE UID='"+usrnm.getText()+"';";
                String query="SELECT * FROM LOGIN WHERE UID='"+usrnm.getText()+"';";
                try{
                    Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
                    Statement stmnt=conn.createStatement();
                    int rows=stmnt.executeUpdate(chk_query);
                    if(rows>0){
                        PreparedStatement ps=conn.prepareStatement(query);
                        ResultSet rs=ps.executeQuery();
                        String pwd="", uidty="", phn="", nme="";
                        while(rs.next()){
                            pwd=rs.getString("PSWD");
                            uidty=rs.getString("UID");
                            phn=rs.getString("PHONE");
                            nme=rs.getString("U_NAME");
                            DataPass dp=DataPass.getInstance();
                            dp.setuid(uidty);
                            dp.setphone(phn);
                        }
                        if(uidty.equals(usrnm.getText()) && pwd.equals(pswd.getText())){
                            alert = new Alert(AlertType.INFORMATION);
                            alert.setTitle("Information Message");
                            alert.setHeaderText(null);
                            alert.setContentText("Welcome, "+nme+"!");
                            alert.showAndWait();
                            Parent root=FXMLLoader.load(getClass().getResource("customer.fxml"));
                            Stage stage=new Stage();
                            Scene scene=new Scene(root);
                            stage.setMaxWidth(1200);
                            stage.setMaxHeight(800);
                            stage.setScene(scene);
                            stage.show();
                            stage.setTitle("Laundry Management System");
                            loginbtn.getScene().getWindow().hide();
                        }
                        else{
                            alert = new Alert(AlertType.ERROR);
                            alert.setTitle("Error Message");
                            alert.setHeaderText(null);
                            alert.setContentText("Wrong Credentials!");
                            alert.showAndWait();
                        }
                    }
                    else{
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("User doesn't exist!");
                        alert.showAndWait();
                    }
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public void forgotpswforgodbtnOnAction() throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("forgotpswd.fxml"));
        Stage stage=new Stage();
        Scene scene=new Scene(root);
        stage.setMaxWidth(1000);
        stage.setMaxHeight(700);
        stage.setScene(scene);
        stage.show();
    }
    
    public void forgotpswdchangebtnOnAction() throws Exception{
        String url="jdbc:mysql://localhost:3306/laundry?useSSL=false";
        String mysqlusr="root";
        String mysqlpwd="1234";
        String query="SELECT * FROM LOGIN WHERE UID='"+uid1.getText()+"';";
        try{
            Connection conn=DriverManager.getConnection(url, mysqlusr, mysqlpwd);
            String uid="", pswd="", skey="", phn="";
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                uid=rs.getString("UID");
                skey=rs.getString("SECKEY");
            }
            DataPass dp=DataPass.getInstance();
            String otp=dp.getotp();
            if(uid.equals("") || !seckey.getText().equals(skey) || seckey.getText().isBlank() || otpval.getText().isBlank()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Credentials!");
                alert.showAndWait();
            }
            else if(otpval.getText().equals(otp)){
                query="UPDATE LOGIN SET PSWD='"+npswd.getText()+"' WHERE UID='"+uid1.getText()+"';";
                Statement stmnt=conn.createStatement();
                stmnt.executeUpdate(query);
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Password Changed!");
                alert.showAndWait();
            }
            else{
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Wrong OTP!");
                alert.showAndWait();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void refbtnOnAction(ActionEvent e) throws Exception{
        if(e.getSource()==srvcsrefbtn){
            sid.setText("");
            clth_type.getSelectionModel().clearSelection();
            svs_type.getSelectionModel().clearSelection();
            pkg.setText("");
            prm.setText("");

            servicesshowdata();
            servicesClothList();
            servicesServiceList();
        }
        
        if(e.getSource()==custrefbtn){
            svs_type.getSelectionModel().clearSelection();
            clth_type.getSelectionModel().clearSelection();
            custpkdate.setValue(null);
            custordrimg.setImage(null);
            cstid.setText("");
            custbill.setText("");
        }
        if(e.getSource()==trackrefbtn){
            imgoid.setText("");
            trackimg.setImage(null);
            
            trackshowdata();
        }
    }
    
    public void switchpane(ActionEvent e){
        if(e.getSource()==srvcsbtn){
            dashboardpane.setVisible(false);
            odrpane.setVisible(false);
            custpane.setVisible(false);
            srvcspane.setVisible(true);
            cmpane.setVisible(false);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            servicesshowdata();
            servicesClothList();
            servicesServiceList();
        }
        if(e.getSource()==dashboardbtn){
            dashboardpane.setVisible(true);
            odrpane.setVisible(false);
            custpane.setVisible(false);
            srvcspane.setVisible(false);
            cmpane.setVisible(false);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            displaydashbrd();
            displaylinechart();
            displaybarchart();
            displayareachart();
        }
        if(e.getSource()==custbtn){
            dashboardpane.setVisible(false);
            odrpane.setVisible(false);
            custpane.setVisible(true);
            srvcspane.setVisible(false);
            cmpane.setVisible(false);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            customersshowdata();
        }
        if(e.getSource()==viewcmpbtn){
            dashboardpane.setVisible(false);
            odrpane.setVisible(false);
            custpane.setVisible(false);
            srvcspane.setVisible(false);
            cmpane.setVisible(true);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            complaintsshowdata();
        }
        if(e.getSource()==odrbtn){
            dashboardpane.setVisible(false);
            odrpane.setVisible(true);
            custpane.setVisible(false);
            srvcspane.setVisible(false);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            ordersshowdata();
        }
        if(e.getSource()==custordrbtn){
            custordrpane.setVisible(true);
            custrackpane.setVisible(false);
            custseesrvpane.setVisible(false);
            custflecmpane.setVisible(false);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            DataPass dp=DataPass.getInstance();
            welcid.setText("UID: "+dp.getuid());
            
            servicesClothList();
            servicesServiceList();
        }
        if(e.getSource()==custrackbtn){
            custordrpane.setVisible(false);
            custrackpane.setVisible(true);
            custseesrvpane.setVisible(false);
            custflecmpane.setVisible(false);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            DataPass dp=DataPass.getInstance();
            welcid.setText("UID: "+dp.getuid());
            
            trackshowdata();
        }
        if(e.getSource()==custseesrvbtn){
            custordrpane.setVisible(false);
            custrackpane.setVisible(false);
            custseesrvpane.setVisible(true);
            custflecmpane.setVisible(false);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            servicesshowdata();
        }
        if(e.getSource()==custflecmpbtn){
            custordrpane.setVisible(false);
            custrackpane.setVisible(false);
            custseesrvpane.setVisible(false);
            custflecmpane.setVisible(true);
            
            welcimgpane.setVisible(false);
            initxt.setText("");
            
            descrpt.setWrapText(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
