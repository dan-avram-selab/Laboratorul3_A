package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        /*
        Carte c = new Carte("Zece negri mititei", "Agatha Cristie", 1998, 719);
        Biblioteca b = new Biblioteca();
        b.add(c);
        b.add(new Carte("Sherlock Holmes", "Sir. Connan Doyle", 1922, 550));
        b.add(new Carte("Codul lui DaVinci", "Dan Brown", 1997, 200));

        b.sort();
        System.out.println(b);
        */

        Thread.currentThread().setName("My Thread");
        System.out.println(Thread.currentThread().getName());

        MyThread[] threadArray = new MyThread[10];
        for (int i=0; i<10; i++)
        {
            threadArray[i] = new MyThread();
            threadArray[i].setName("" + i);
            threadArray[i].start();
        }

        for (int i =0; i<10;i++) {
            try {
                threadArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}