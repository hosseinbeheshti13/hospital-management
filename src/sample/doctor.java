package sample;

public class doctor extends person{
    private String surgeri ;
    private String tajviz;


    public String getSurgeri() {
        return surgeri;
    }

    public void setSurgeri(String surgeri) {
        this.surgeri = surgeri;
    }

    public String getTajviz() {
        return tajviz;
    }

    public void setTajviz(String tajviz) {
        this.tajviz = tajviz;
    }

    public String toString() {
        return"doctor idcode:"+ getIdcode() +"\n"+"doctor name:"+ getNeme()  + "\n"+"doctor password:"+getPassword()
                + "\n"+"surgeri:"+getSurgeri() + "\n"+"tajviz:"+getTajviz()+ "\n"+"date:"+getDate();
    }
}
