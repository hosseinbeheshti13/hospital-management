package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.security.SecureRandom;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

public class signupcontroller {


    
    public TextField lsttxt;
    public TextField idtxt;
    public TextField agetxt;
    public TextArea description;
    public TextArea anotherdiseas;
    public Button accountingbtn;
    public TextField frsttxt;
    public static String generateRandomPassword()
    {
        int len =8;

        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }

    public void cliclaccount(ActionEvent actionEvent) throws IOException {

        FileManager makefile = new FileManager();
        if((makefile.idcheck(idtxt.getText()))==1){
            Stage primaryStage=(Stage) frsttxt.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("faild.fxml"));
            primaryStage.setTitle("faild");
            primaryStage.setScene(new Scene(root, 494, 720));
            primaryStage.show();
        }else{
            String doctor1 = "ramin faraji";
            String doctor2 = "nima bigli";
            String doctor3 = "negin ebrahimi";
            String doctor4 = "erfan bakhtiari";
            String nurse1 = "nahid ebrahimi";
            String nurse2 = "erfan molaii";
            String nurse3 = "mehsi hashemi";
            String M ;
            ArrayList<String> my_list = new ArrayList<String>();
            my_list.add(doctor1);
            my_list.add(doctor2);
            my_list.add(doctor3);
            my_list.add(doctor4);
            int index = (int)(Math.random() * my_list.size());
            ArrayList<String> my_list2 = new ArrayList<String>();
            my_list2.add(nurse1);
            my_list2.add(nurse2);
            my_list2.add(nurse3);
            my_list.add(doctor4);
            int index2 = (int)(Math.random() * my_list2.size());
            String password;
            password = generateRandomPassword();
            makefile.setIdcode(idtxt.getText());
            makefile.setDoctor(my_list.get(index));
            makefile.setNurse(my_list2.get(index2));
            makefile.setFirstname(frsttxt.getText());
            makefile.setLastname(lsttxt.getText());
            makefile.setAge(agetxt.getText());
            makefile.setDescribe(description.getText());
            makefile.setAnotherdiseas(anotherdiseas.getText());

            makefile.setPassword(password);
            makefile.filewriter(1);
            Stage primaryStage = (Stage) accountingbtn.getScene().getWindow();
             FXMLLoader loader = new  FXMLLoader(getClass().getResource("accounted.fxml"));
            Parent root = loader.load();
            accountedcontroller controller = loader.getController();
            controller.setussrnamelabel(frsttxt.getText(),lsttxt.getText(),agetxt.getText(),idtxt.getText(),password,my_list.get(index),my_list2.get(index2));
            primaryStage.setTitle("accounted");
            primaryStage.setScene(new Scene(root, 638, 676));
            primaryStage.show();
        }
    }


}
