package meucci;

public class MyThread extends Thread{
    public MyThread(String nome){
        super(nome);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(this.getName() + " sta contando: " + i);
        }
    }
}
