package OOP01;

public class Personel {
    private String adi;
    private String soyadi;
    private int age;
    private double maasi;

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getAdi() {
        return this.adi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSoyadi() {
        return this.soyadi;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setMaasi(double maasi) {
        this.maasi = maasi;
    }

    public double getMaasi() {
        return this.maasi;
    }
    public void calis(){
        System.out.println("Personle çalışıyor.");
    }
    public void evrakİmzalama(){
        System.out.println("Personel evrak imzalıyor.");
    }
    public void showInfos(){
        System.out.println();
        System.out.println(this.getAdi()+" "+this.getSoyadi());
        System.out.println("Yaşı: "+this.getAge());
        System.out.println("Maaşı: "+this.getMaasi());

    }
}
