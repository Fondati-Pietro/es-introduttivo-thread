package meucci;

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread("Mario");
        t.start();
        for(int i = 0; i < 10; i++){
            System.out.println("Il Main sta contando: " + i);
        }
    }
}