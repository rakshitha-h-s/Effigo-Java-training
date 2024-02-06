package encoding_decoding;

public class ThreadsExample {
public static void main(String[] args) {
	Threadex1 ex=new Threadex1();
	Thread th=new Thread(ex);
	th.start();
	Threadex2 ex2=new Threadex2();
	Thread th2=new Thread(ex2);
	th2.start();
}
}
class Threadex1 implements Runnable{

	@Override
	public void run() {
	for(int i=0;i<4;i++) {
		try {
			System.out.println(i);
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}		
	}
	
}
class Threadex2 extends Thread{
	public void run() {
		try {
		Thread.sleep(6000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("runs simultaneously");
		}
		
	}
}