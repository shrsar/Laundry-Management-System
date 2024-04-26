/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package laundrymgmt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author hp
 */
public class LaundryMgmt extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("loginpage.fxml"));
        primaryStage.setTitle("Laundry Management System");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaxWidth(1000);
        primaryStage.setMaxHeight(700);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
