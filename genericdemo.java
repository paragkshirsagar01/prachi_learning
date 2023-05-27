import java.util.*;
class area<T>{
	public void calc(T a){//(Integer a)
		System.out.println(a);
	}
}

public class genericdemo{
	public static void main(String[] args){
		area<Integer> a=new area<>();
		//a.calc(10);
		area<String> a2=new area<>();
		//a2.calc("xyz");
		ArrayList<Integer> arr=new ArrayList<>();
		LinkedList<String> arr2=new LinkedList<>();
		arr2.add("30");
		arr.add(10);
		arr.add(20);
		System.out.println("0ind"+arr2.get(0));
		arr.remove(0);
		for(Integer i:arr){//for each loop
			System.out.println(i);
		}

		HashSet<Integer> s1=new HashSet<>();
		System.out.println(s1.add(10));
		System.out.println(s1.add(10));
	}
}



