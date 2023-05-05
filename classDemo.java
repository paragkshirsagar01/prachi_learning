// public private protected default
class demo{
	int a=10;
	int b=20;
	//access return type name(parameters)
	public int sum(int a,int b){
		//System.out.println(a+b);
		return(a+b);
	}
}
public class classDemo{
	public static void main(String[] args){
		int a=40;
		demo x=new demo();
		//System.out.println(x.a);
		int ans=x.sum(10,(int)20.2);
		System.out.println(ans);
	}
}