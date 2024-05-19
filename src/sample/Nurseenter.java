package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Nurseenter {
    public Label lastname;
    public Label firstname;
    public Label age;
    public Label password;
    public Label describe;
    public Label another;
    public Label firstname1;
    public Label lastname1;
    public Label age1;
    public Label password1;
    public Label describe1;
    public Label another1;
    public Label firstname2;
    public Label lastname2;
    public Label age2;
    public Label password2;
    public Label describe2;
    public Label another2;
    public Button visit;

    public void setidcodenurse(String idcode) {
        try {
            String n ;
            String m ;
            String l;
            m = "nurse idcode:" + idcode;
            BufferedReader reader = new BufferedReader(new FileReader("patient.txt"));
            while ((n = reader.readLine()) != null) {

                if (n.equals(m)) {
                    l =reader.readLine();

                    while ((n = reader.readLine()) != null) {
                        if(n.equals(l)){
                            if ((n = reader.readLine()) != null) {
                                firstname.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                lastname.setText(n);
                            }
                            if ((n= reader.readLine()) != null) {
                                age.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                describe.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                another.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                password.setText(n);
                            }
                            break;
                        }
                    } while ((n = reader.readLine()) != null) {
                        if(n.equals(l)){
                            if ((n = reader.readLine()) != null) {
                                firstname1.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                lastname1.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                age1.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                describe1.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                another1.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                password1.setText(n);
                            }
                            break;
                        }
                    } while ((n = reader.readLine()) != null) {
                        if(n.equals(l)){
                            if ((n = reader.readLine()) != null) {
                                firstname2.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                lastname2.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                age2.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                describe2.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                another2.setText(n);
                            }
                            if ((n = reader.readLine()) != null) {
                                password2.setText(n);
                            }
                            break;
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void visit(ActionEvent actionEvent) throws IOException {
        Stage primaryStage=(Stage)  visit.getScene().getWindow();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("visit nurse.fxml"));
        primaryStage.setTitle("visit");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}