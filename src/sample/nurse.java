package sample;

public class nurse extends person{
    private String drug;
    private String sharayet;

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getSharayet() {
        return sharayet;
    }

    public void setSharayet(String sharayet) {
        this.sharayet = sharayet;
    }
    public String toString() {
        return"nurse idcode:"+ getIdcode() +"\n"+"nurse name:"+ getNeme() + "\n"+"nurse password:"+getPassword()
                + "\n"+"drug:"+getDrug() + "\n"+"sharayet:"+getSharayet()+ "\n"+"date of check:"+getDate();
    }
}
