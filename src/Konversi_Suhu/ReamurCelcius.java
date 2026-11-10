package Konversi_Suhu;

public class ReamurCelcius implements KonversiSatuan {
    private String asal;
    private String tujuan;

    public ReamurCelcius() {
        this.asal = "Reamur";
        this.tujuan = "Celcius";
    }

    @Override
    public float konversi(float input) {
        return input / (4f / 5);
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
