import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Datos> datos = new ArrayList<Datos>();
        setDatos(datos);

        for (int x = 0; x < datos.size(); x++) {
            System.out.println(datos.get(x).toString());
        }

        randomize(datos);
    }

    public static void setDatos(ArrayList<Datos> datos) {
        Random r = new Random();
        for (int x = 0; x < 10; x++) {
            int valorRandom = r.nextInt(10000);

            Datos ejemplo = new Datos(valorRandom, "a");
            datos.add(ejemplo);
        }
    }

    static void randomize(ArrayList arrayList) {
        // creating
        // ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();

        // adding object in ArrayList
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        al.add(80);

        System.out.println("Before shuffling Arraylist:");

        // getting Iterator
        // from arraylist to
        // traverse elements
        Iterator itr = arrayList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        System.out.println("");

        Random r1 = new Random();

        for (int i = arrayList.size() - 1; i >= 1; i--) {
            // swapping current index value
            // with random index value
            Collections.swap(arrayList, i, r1.nextInt(i + 1));
        }

        System.out.println("After shuffling Arraylist:");

        itr = arrayList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}
