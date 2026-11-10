package Konversi_Suhu;

public class CelciusFarenheit implements KonversiSatuan {
    String asal, tujuan;

    public CelciusFarenheit() {
        this.asal = "Celcius";
        this.tujuan = "Farenheit";
    }

    @Override
    public float konversi(float input) {
        return input * 9f / 5 + 32;
    }

    @Override
    public String satuanInput() {
        return this.asal;
    }

    @Override
    public String satuanOutput() {
        return this.tujuan;
    }
}
