class demoday4{
	private int a;
	String[] str1=new String[5][6];
	demoday4(int a){
		this.a=a;
	}
	public void seta(int a){
		this.a=a;
	}
	public int geta(){
		return this.a;
	}
}
public class demoday4main{
	public static void main(String[] args){
		demoday4 d1=new demoday4(10);
		demoday4 d2=new demoday4(20);
		//System.out.println(d1.a);
		for(int i=1;i<=5;i++)
		d1.str1[i]="ab "+String.valueOf(i);
		for(int i=1;i<=5;i++)
		System.out.println(d1.str1[i]);
	}
}

//mutable- change 
//immutable - no change
//String str=new String("abc"); Is string is mutable or immutable? why?


//how to create immutable class
/*
1 class must be final
2 every variable must be private
3 only constructor must be there to assing values and no setter method
4 only geter method must be present
*/

