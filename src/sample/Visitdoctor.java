package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Visitdoctor {
    public TextField id;
    public Button check;
    public TextField diagnosis_ill;
    public Label surgery;

    public void check(ActionEvent actionEvent) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        try {
            String filePath = "doctor.txt";
            BufferedWriter write = new BufferedWriter(new FileWriter(filePath, true));
            write.write("\npassword:" + id.getText());
            write.write("\nsurgery:" + surgery.getText());
            write.write("\ndiagnosis_ill:" + diagnosis_ill.getText());
            write.write("\ndoctor visit date:" + dtf.format(now));
            write.close();


        } catch (IOException e) {
            System.out.println("an error");
            e.printStackTrace();
        }
        Stage stage = (Stage) check.getScene().getWindow();
        stage.close();
    }
    }

