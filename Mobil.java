// 1. Class & Object
public class Mobil { 
    // 4. Encapsulation
    private String merek;
    private String model;
    private int cc;

    // 2. Constructor & Instance Method
    public Mobil(String merek, String model, int cc) { 
        this.merek = merek;
        this.model = model;
        this.cc = cc;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCC() {
        return cc;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    // 3. Overloading
    public String info() {
        return "Merek: " + merek + ", Model: " + model + ", CC: " + cc;
    }
}