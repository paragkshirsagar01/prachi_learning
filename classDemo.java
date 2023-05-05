

// public private protected default
class demo{
	demo(){
		System.out.println("default constructor");//default const.
	}
	demo(int a){
		System.out.println("default constructor 2");//parameterized const.
	}
	demo(int a,int b){
		for(int i=0;i<10;i++)
		System.out.println(this.sum(a,b));
		if(a==10)
		System.out.println("matched");
	}
	//access return type name(parameters)
	public int sum(int a,int b){//creating methods(functions)
		//System.out.println(a+b);
		return(a+b);
	}
}



public class classDemo{
	public static void main(String[] args){
		int a=40;
		demo x=new demo(20,60); //creating objects of class demo
		//System.out.println(x.a);
	}
}



