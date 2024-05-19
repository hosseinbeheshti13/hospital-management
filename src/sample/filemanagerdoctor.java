package sample;

import java.io.*;

public class filemanagerdoctor {
    public  void doctor1(){
        String filePath = "patient.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            doctor d1 = new doctor();
            d1.setNeme("ramin faraji");
            d1.setIdcode("r12r");
            d1.setPassword("1234");
            writer.write(d1.toString());
            doctor d2 = new doctor();
            d2.setNeme("nima bigli");
            d2.setIdcode("n12n");
            d2.setPassword("1234");
            writer.write("\n"+ String.valueOf(d2));
            doctor d3 = new doctor();
            d3.setNeme("negin ebrahimi");
            d3.setIdcode("z12z");
            d3.setPassword("1234");
            writer.write("\n"+String.valueOf(d3)+"\n");
            doctor d4 = new doctor();
            d4.setNeme("erfan bakhtiari");
            d4.setIdcode("u12u");
            d4.setPassword("1234");
            writer.write(String.valueOf(d4)+"\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public  void nurse1(){
        String filePath = "patient.txt";
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(filePath, true));
            nurse n1 = new nurse();
            n1.setNeme("nahid ebrahimi");
            n1.setIdcode("e12e");
            n1.setPassword("1234");
            write.write(String.valueOf(n1)+"\n");
            nurse n2 = new nurse();
            n2.setNeme("erfan molaii");
            n2.setIdcode("a12a");
            n2.setPassword("1234");
            write.write(String.valueOf(n2)+"\n");
            nurse n3 = new nurse();
            n3.setNeme("erfan molaii");
            n3.setIdcode("q12q");
            n3.setPassword("1234");
            write.write(String.valueOf(n3)+"\n");
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public int doctorcheck(){
        try {
            String comp;
            String di ="r12r";
            comp = "doctor idcode:"+di ;
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
    public int logindoctor(String username,String pass){
        try {
            String comp;
            String comp2;
            comp = "doctor idcode:"+ username ;
            comp2 = "doctor password:"+ pass ;
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
    public int loginnurse(String username,String pass){
        try {
            String comp;
            String comp2;
            comp = "nurse idcode:"+ username ;
            comp2 = "nurse password:"+ pass ;
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
