class demoDay3{
	static int id=0;
	int empid;
	String name;
	demoDay3(String name){
		demoDay3.id=id+1;
		this.empid=demoDay3.id;
		this.name=name;
	}
}
//1 parag
public class demoDay3Main{
	public static void main(String[] args){
		demoDay3 d1=new demoDay3("prachi");
		demoDay3 d2=new demoDay3("xyx");
		System.out.println(d1.empid+" "+d1.name);
		System.out.println(d2.empid+" "+d2.name);
		String str1=new String("abc"); //hc 1
		System.out.println("String 1 ="+str1);
		String str2=new String("abc"); //hc 1
		System.out.println("String 2 ="+str2);
		if(str1==str2){
			System.out.println("matched");
		}else{
			System.out.println("not matched");
		}
	}
}	

//hashcode method overriding 
