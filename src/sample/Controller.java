package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.*;

import static javafx.fxml.FXMLLoader.load;

public class Controller {
    public Button btn_login;
    public Button btn_sign;

    public void sign_click(ActionEvent actionEvent) throws IOException {
        filemanagerdoctor check = new filemanagerdoctor();
        if((check.doctorcheck()) == 1){
            System.out.println("exist");
        }else{

            check.doctor1();
            check.nurse1();
        }
        Stage primaryStage=(Stage) btn_sign.getScene().getWindow();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        primaryStage.setTitle("sign up");
        primaryStage.setScene(new Scene(root, 865, 689));
        primaryStage.show();

    }

    public void log_click(ActionEvent actionEvent) throws IOException {
        filemanagerdoctor checke = new filemanagerdoctor();
        if((checke.doctorcheck()) == 1){
            System.out.println("exist");
        }else{
            checke.doctor1();
            checke.nurse1();
        }
        Stage primaryStage=(Stage) btn_login.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("login");
        primaryStage.setScene(new Scene(root, 687, 525));
        primaryStage.show();
    }
}
