package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class enteringcontroller {
    public Label idcheck;
    public Label firstnamme;
    public Label lastnamme;
    public Label agge;
    public Label describe;
    public Label another;
    public Label pasword;
    public Label doctor;
    public Label nurse;
    public Label surgery;
    public Label date;
    public Label diagnosis_ill;
    public Label nurse_date;
    public Label drog;
    public Label condition;
    public Button finish;

    public void setidcodelabel(String idcode ){
        try {

            String m;
            String n ;
            String xr = null;
            String a;
            m = "idcode:" + idcode;
            BufferedReader reader = new BufferedReader(new FileReader("patient.txt"));
            while ((n = reader.readLine()) != null) {

                if (n.equals(m)) {
                    idcheck.setText(n);

                                 if ((n = reader.readLine())!=null) {

                                     doctor.setText(n);
                                 }
                                if ((n = reader.readLine()) != null) {
                                    nurse.setText(n);
                                }
                                if ((n = reader.readLine()) != null) {
                                    firstnamme.setText(n);

                                }
                                if ((n = reader.readLine()) != null) {
                                    lastnamme.setText(n);
                                }
                                if ((n = reader.readLine()) != null) {
                                    agge.setText(n);
                                }
                                if ((n = reader.readLine()) != null) {
                                    describe.setText(n);
                                }
                                if ((n = reader.readLine()) != null) {
                                    another.setText(n);
                                }
                                if ((xr = reader.readLine()) != null) {
                                    pasword.setText(xr);
                                }
                            }
            }
            BufferedReader read = new BufferedReader(new FileReader("doctor.txt"));
            while ((a = read.readLine()) != null) {

                if (a.equals(xr)) {
                    if ((a = read.readLine())!=null) {

                        surgery.setText(a);
                    }
                    if ((a = read.readLine()) != null) {
                        diagnosis_ill.setText(a);
                    }
                    if ((a = read.readLine()) != null) {
                        date.setText(a);

                    }
                }
            }
            BufferedReader reade = new BufferedReader(new FileReader("nurse.txt"));
            while ((a = reade.readLine()) != null) {

                if (a.equals(xr)) {
                    if ((a = reade.readLine())!=null) {

                        condition.setText(a);
                    }
                    if ((a = reade.readLine()) != null) {
                        drog.setText(a);
                    }
                    if ((a = reade.readLine()) != null) {
                        nurse_date.setText(a);

                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void finish(ActionEvent actionEvent) {
        Stage stage = (Stage) finish.getScene().getWindow();
        stage.close();
    }
}
