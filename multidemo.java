class printMsg{
	synchronized void print(String msg){
		for(int i=0;i<11;i++){
			System.out.println(msg+"  "+i);
		}
		sleep();
	}
}
class demothread extends Thread{
	printMsg m;
	String msg;
	demothread(printMsg m,String msg){
		this.m=m;
		this.msg=msg;
	}
synchronized{

}
	public void run(){
		m.print(this.msg);
	}
}
public class multidemo{
	public static void main(String[] args){
		printMsg m=new printMsg();
		//m.print("parag");//task1
		demothread d1=new demothread(m,"parag");
		demothread d2=new demothread(m,"xyz");
		d1.start();
		d2.start();
		System.out.println("finished");//task2 
	}
}