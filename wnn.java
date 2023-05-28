class printdem{
	synchronized void print(String msg) throws InterruptedException{
		wait();
		for(int i=0;i<10;i++){
			System.out.println(msg+" "+i);
		}
	}
	synchronized void print2(String msg) throws InterruptedException{
		for(int i=0;i<10;i++){
			System.out.println(msg+" "+i);
		}
		notify();
	}
}

class demthread extends Thread{
	printdem m;
	demthread(printdem m){
		this.m=m;
	}
	public void run(){
		try{
		m.print("abc");
		//m.print2("xyz");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class demthread1 extends Thread{
	printdem m;
	demthread1(printdem m){
		this.m=m;
	}
	public void run(){
		try{
		//m.print("abc");
		m.print2("xyz");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

public class wnn{
	public static void main(String[] args){
		printdem m=new printdem();
		demthread d=new demthread(m);
		d.start();
		demthread1 d1=new demthread1(m);
		d1.start();
	}
}