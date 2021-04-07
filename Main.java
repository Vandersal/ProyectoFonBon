import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Datos> datos = new ArrayList<Datos>();

    public static void main(String[] args) {

        setDatos(datos);

        for (int x = 0; x < datos.size(); x++)
            System.out.println(datos.get(x).toString());
    }

    public static void setDatos(ArrayList<Datos> datos) {
        Random r = new Random();
        int valorRandom = r.nextInt(10000);

        Datos ejemplo = new Datos(valorRandom, "a");
        datos.add(ejemplo);
    }
}
