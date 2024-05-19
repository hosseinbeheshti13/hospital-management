package sample;

import java.io.*;


public class FileManager {

    String firstname;
    String lastname ;
    String age ;
    String describe ;
    String anotherdiseas ;
    String idcode ;
    String password;
    String doctor;
    String nurse;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setAnotherdiseas(String anotherdiseas) {
        this.anotherdiseas = anotherdiseas;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int idcheck(String check){
        try {
            String comp;
            comp = "idcode:"+check ;
            String f;
            BufferedReader reader = new BufferedReader(new FileReader("patient.txt"));
            while ((f = reader.readLine())!= null ){

                if(f.equals(comp)){
                    return 1;
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("an error");
            e.printStackTrace();
        }


        return 0;
    }

    public void filewriter(int start) {
    if(start==1) {
        try {
            String filePath = "patient.txt";
            BufferedWriter write = new BufferedWriter(new FileWriter(filePath, true));
            write.write("patientb infomation" );
            write.write("\nidcode:" + idcode);
            write.write("\ndoctor name:" + doctor);
            write.write("\nnurse name:" + nurse);
            write.write("\nfirstname:" + firstname);
            write.write("\nlastname:" + lastname);
            write.write("\nage:" + age);
            write.write("\ndescribe:" + describe);
            write.write("\nanotherdiseas:" + anotherdiseas);
            write.write("\npassword:" + password);
            write.write("\nregisterd\n\n" );
            write.close();


        } catch (IOException e) {
            System.out.println("an error");
            e.printStackTrace();
        }
    }
    }
    public int login(String username,String pass){
        try {
            String comp;
            String comp2;
            comp = "idcode:"+ username ;
            comp2 = "password:"+ pass ;
            String f;
            String n;
            BufferedReader reader = new BufferedReader(new FileReader("patient.txt"));
            while ((f = reader.readLine())!= null ){
                if(f.equals(comp)){
                    while ((n = reader.readLine())!= null ) {
                        if (n.equals(comp2)) {
                            return 1;
                        }
                    }
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("an error");
            e.printStackTrace();
        }


        return 0;
    }

    }

