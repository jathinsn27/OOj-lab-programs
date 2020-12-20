class Thread1 implements Runnable{
    Thread t;
    String name;
    int time;
    Thread1(String threadname,int time) {
        name = threadname;
        this.time=time;
        t = new Thread(this, name);
        System.out.println("thread:"+ t);
        t.start(); 
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name);
                Thread.sleep(time);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(name + "Interrupting Thread");
        }
        System.out.println(name + " Exiting Thread");
    }
}
class ThreadMain {
    public static void main(String args[]) {
        Thread1 t1=new Thread1("BMS College of Engineering",10000);
        Thread1 t2=new Thread1("CSE",2000);
    }
}