package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class faildcontroller {
    public Button back;

    public void bacck(ActionEvent actionEvent) throws IOException {
        Stage primaryStage=(Stage) back.getScene().getWindow();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("sample");
        primaryStage.setScene(new Scene(root, 698, 576));
        primaryStage.show();
    }
}
