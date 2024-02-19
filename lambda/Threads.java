package lambda;

public class Threads {
    public static void main(String[] args) {
        Runnable tarefa1 = new Trabalho1();
        Runnable tarefa2 = new Runnable() {


            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Trabalho2 #" + i);
                    try {
                        Thread.sleep(1000);
                    }catch(Exception e){}
                }
            }
        };

        Runnable tarefa3 = Threads :: trabalho3;

        // As threads fazem as tarefas executarem de forma paralela
        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);
        Thread t3 = new Thread(tarefa3);


        // Usando as tarefas em paralelo
        t1.start();
        t2.start();
        t3.start();
    }
    static void trabalho3(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Trabalho3 #" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }

    }
}
