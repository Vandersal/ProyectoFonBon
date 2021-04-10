import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // creacion del arraylist de tipo datos y llenado del alfabeto
        ArrayList<Datos> datos = new ArrayList<Datos>();
        String[] arrayLetras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        setDatos(datos, arrayLetras);

        for (int x = 0; x < datos.size(); x++) {
            System.out.println(datos.get(x).toString());
        }

        fisherYates(datos);
        // cycleSort(datos, datos.size());

    }

    public static void setDatos(ArrayList<Datos> datos, String[] arrayLetras) {
        // llenado de arraylist de tipo Datos
        Random r = new Random();
        Random y = new Random();
        for (int x = 0; x < 10; x++) {
            int valorRandom = r.nextInt(10000);
            int randomLetra = y.nextInt(26);

            Datos contenidDatos = new Datos(valorRandom, arrayLetras[randomLetra]);
            datos.add(contenidDatos);
        }
    }

    static void fisherYates(ArrayList<Datos> arrayList) {
        Iterator itr = arrayList.iterator();
        Random r1 = new Random();

        // intercambio de lugares del contenido del array
        for (int i = arrayList.size() - 1; i >= 1; i--) {
            Collections.swap(arrayList, i, r1.nextInt(i + 1));
        }

        System.out.println("");

        itr = arrayList.iterator();

        // imprecion del array desordenado
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }

    public static void cycleSort(ArrayList<Datos> a, int n) {
        int writes = 0, start, pos, i;
        Datos element = new Datos();
        Datos temp = new Datos();

        for (start = 0; start <= n - 2; start++) {
            element = a.get(start);
            pos = start;
            for (i = start + 1; i < n; i++)
                if (a.get(i).getNumero() < element.getNumero())
                    pos++;
            if (pos == start)
                continue;
            while (element.getNumero() == a.get(pos).getNumero())
                pos += 1;
            if (pos != start) {
                temp = element;
                element = a.get(pos);
                a.set(pos, temp);
                writes++;
            }
            while (pos != start) {
                pos = start;
                for (i = start + 1; i < n; i++)
                    if (a.get(i).getNumero() < element.getNumero())
                        pos += 1;
                while (element.getNumero() == a.get(pos).getNumero())
                    pos += 1;
                if (element.getNumero() != a.get(pos).getNumero()) {
                    temp = element;
                    element = a.get(pos);
                    a.set(pos, temp);
                    writes++;
                }
            }
        }

        // ordenador alfabetico
        Collections.sort(a, new Comparator<Datos>() {
            public int compare(Datos obj1, Datos obj2) {
                return obj1.getLetra().compareTo(obj2.getLetra());
            }
        });

        // imprecion del array ordenado
        System.out.println("");
        for (int x = 0; x < a.size(); x++) {
            System.out.println(a.get(x).toString());
        }

    }

}
