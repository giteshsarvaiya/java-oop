//Example-2 with wait() and notify():
class PostBox {
    String msg = null;
    synchronized void readMsg() {
        if (msg == null) {
            System.out.println("Thread waiting for message");
            try { wait(); } catch (Exception e) {    }
            System.out.println("Message reading: " + msg);
        }
    }
    synchronized void writeMsg() {
        System.out.println("Setting Message");
        msg = "MESSAGE INFORMATION";
        notify();
        System.out.println("Message Written");
    }
}
class Writer extends Thread {
    PostBox p=null;
    Writer(PostBox p){this.p=p;}
    public void run(){ p.writeMsg();}
}
class Reader extends Thread{
    PostBox p=null;
    Reader(PostBox p){this.p=p;}
    public void run(){p.readMsg();}
}
public class NewClass {
    public static void main(String[] arrrr) throws InterruptedException {
        PostBox p = new PostBox();
        Writer w=new Writer(p);
        Reader r=new Reader(p);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(w);
        t1.start();
        t2.start();
    }
}

/*
Output:
Thread waiting for message
Setting Message
Message Written
Message reading: MESSAGE INFORMATION
*/