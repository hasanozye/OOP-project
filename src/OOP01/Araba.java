package OOP01;

public class Araba {
    private   String renk;
    private    String Marka;
    private int modelYili;
    private String model;
    private double silindirhacmi;



    public int getModelYili(){
        return this.modelYili;
    }


    public void setModelYili(int modelYili) {
        if (modelYili > 0) {
            this.modelYili = modelYili;
        }
    }
}
