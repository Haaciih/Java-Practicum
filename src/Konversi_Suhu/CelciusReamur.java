package Konversi_Suhu;

public class CelciusReamur implements KonversiSatuan {
    private String asal;
    private String tujuan;

    public CelciusReamur() {
        this.asal = "Celcius";
        this.tujuan = "Reamur";
    }

    @Override
    public float konversi(float input) {
        return 4f / 5 * input;
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

