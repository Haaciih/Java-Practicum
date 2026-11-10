package Konversi_Suhu;

public class FarenheitCelicius implements KonversiSatuan {
    private String asal;
    private String tujuan;

    public FarenheitCelicius() {
        this.asal = "Farenheit";
        this.tujuan = "Celcius";
    }

    @Override
    public float konversi(float input) {
        return (input * 9f / 5f) + 32f;
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