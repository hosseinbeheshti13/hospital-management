package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class accountedcontroller {

    public Label firstname;
    public Label lastname;
    public Label password;
    public Label idcode;
    public Label agee;
    public Button EXIT;
    public Label doctorr;
    public Label nursee;

    public void setussrnamelabel(String frst ,String lst ,String age ,String id ,String password1,String doctor,String nurse){
         firstname.setText(frst);
         lastname.setText(lst);
        idcode.setText(id);
        agee.setText(age);
        password.setText(password1);
        doctorr.setText(doctor);
        nursee.setText(nurse);
    }

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) EXIT.getScene().getWindow();
        stage.close();

    }
}
