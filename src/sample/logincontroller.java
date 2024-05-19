package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class logincontroller {
    public Button btn_login;
    public TextField usser_name;
    public PasswordField password;
    public Label wrong;

    public void loginn(ActionEvent actionEvent) throws IOException {
        FileManager check = new FileManager();
        filemanagerdoctor checke = new filemanagerdoctor();
        if((check.login(usser_name.getText(), password.getText())) == 1){
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("entering.fxml"));
            Parent root = loader.load();
            enteringcontroller controller = loader.getController();
            controller.setidcodelabel(usser_name.getText());
            primaryStage.setTitle("entering");
            primaryStage.setScene(new Scene(root, 638, 676));
            primaryStage.show();

        }else if((checke.logindoctor(usser_name.getText(), password.getText()))==1) {
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("doctorenter.fxml"));
            Parent root = loader.load();
            Doctorenter controll = loader.getController();
            controll.setidcodedoctor(usser_name.getText());
            primaryStage.setTitle("entering");
            primaryStage.setScene(new Scene(root, 638, 676));
            primaryStage.show();
        }else if((checke.loginnurse(usser_name.getText(), password.getText()))==1) {
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("nurseenter.fxml"));
            Parent root = loader.load();
            Nurseenter controll = loader.getController();
            controll.setidcodenurse(usser_name.getText());
            primaryStage.setTitle("entering");
            primaryStage.setScene(new Scene(root, 638, 676));
            primaryStage.show();
        }else {
            wrong.setText("your password or ussername is wrong");
        }
    }
}
