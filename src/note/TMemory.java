package note;

class Start {
    public static void main(String[] args) {
        System.out.println("Hello OOP!!!");
    }
}

class Start2 {
    public static void main(String[] args) {
        int i;
        i = 10;

        double d = 20.0;
    }
}

class Start3 {
    public static void main(String[] args) {
        int i = 10;
        int k = 20;

        if (i == 10) {
            int m = k + 5;
            k = m;
        } else {
            int p = k + 10;
            k = p;
        }

        //k = m + p;
    }
}

class Start4 {
    public static void main(String[] args) {
        int k = 5;
        int m;

        m = square(k);
    }

    private static int square(int k) {
        int result;

        k = 25;

        result = k;

        return result;
    }
}

class Start5 {
    static int share;

    public static void main(String[] args) {
        share = 55;

        int k = fun(5, 7);

        System.out.println(share);
    }

    private static int fun(int m, int p) {
        share = m + p;

        return m - p;
    }
}

class Start6 extends Thread {
    static int share;

    public static void main(String[] args) {
        Start6 t1 = new Start6();
        Start6 t2 = new Start6();

        t1.start();
        t2.start();
    }

    public void run() {
        for (int count = 0; count < 10; count++) {
            System.out.println(share++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
