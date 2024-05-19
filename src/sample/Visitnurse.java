package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Visitnurse {
    public TextField condition;
    public TextField drug;
    public Button controll;
    public TextField password;

    public void controll(ActionEvent actionEvent) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        try {
            String filePath = "nurse.txt";
            BufferedWriter write = new BufferedWriter(new FileWriter(filePath, true));
            write.write("\npassword:" + password.getText());
            write.write("\ncondition:" + condition.getText());
            write.write("\ndrog:" + drug.getText());
            write.write("\nnurse check date:" + dtf.format(now));
            write.close();


        } catch (IOException e) {
            System.out.println("an error");
            e.printStackTrace();
        }
        Stage stage = (Stage) controll.getScene().getWindow();
        stage.close();
    }
}
