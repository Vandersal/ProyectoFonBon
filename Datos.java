public class Datos {
    public int Numero;
    public String Letra;

    public Datos(int numero, String letra) {
        this.Numero = numero;
        this.Letra = letra;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String letra) {
        this.Letra = letra;
    }

    @Override
    public String toString() {
        String string;
        string = "Letra:" + Letra + " Numero:" + Numero;
        return string;
    }
}
