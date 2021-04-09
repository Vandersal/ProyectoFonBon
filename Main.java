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

        // fisherYates(datos);
        //cycleSort(datos, datos.size());

        System.out.println("" + datos.size());
        for (int x = 0; x < datos.size(); x++) {
            System.out.println(datos.get(x).toString());
        }

    }

    public static void setDatos(ArrayList<Datos> datos) {
        Random r = new Random();
        for (int x = 0; x < 10; x++) {
            int valorRandom = r.nextInt(10000);

            Datos ejemplo = new Datos(valorRandom, "a");
            datos.add(ejemplo);
        }
    }

    static void fisherYates(ArrayList<Datos> arrayList) {
        Iterator itr = arrayList.iterator();
        System.out.println("");

        Random r1 = new Random();

        for (int i = arrayList.size() - 1; i >= 1; i--) {
            Collections.swap(arrayList, i, r1.nextInt(i + 1));
        }

        System.out.println("After shuffling Arraylist:");

        itr = arrayList.iterator();

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
                // swap(element, a[pos]);
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
    }


/*
    public static void mergeSort(ArrayList<Datos> arrayList){
        Iterator itr = arrayList.iterator();
        int itr[] = { 12, 11, 13, 5, 6, 7 };
            System.out.println("Given Array"+itr);
    
            mergesort ob = new mergesort();
            ob.sort(itr, 0, itr.length - 1);
    
            System.out.println("\nSorted array"+itr);
            
        int l, m, r;

        {
            int n1 = m - l + 1;
            int n2 = r - m;
    
            int L[] = new int[n1];
            int R[] = new int[n2];

            for (int i = 0; i < n1; ++i)
                L[i] = itr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = itr[m + 1 + j];
            
            int i = 0, j = 0;
    
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    itr[k] = L[i];
                    i++;
                }
                else {
                    itr[k] = R[j];
                    j++;
                }
                k++;
            }
         
            while (i < n1) {
                itr[k] = L[i];
                i++;
                k++;
            }
           
            while (j < n2) {
                itr[k] = R[j];
                j++;
                k++;
            }
        }
    
      void sort(int itr[], int l, int r)
        {
            if (l < r) {
                
                int m =l+ (r-l)/2;
    
               
                sort(itr, l, m);
                sort(itr, m + 1, r);
    
    
                merge(itr, l, m, r);
            }
        }
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
        
    }
    */

}
