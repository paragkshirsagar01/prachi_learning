interface parentintfA{
	int add();
}

abstract class parentB{
	int a;
	abstract int add();
	int square(int a){
		this.a=a*a;
		return this.a;
	}
}


public class demoday5main{
	public static void main(String[] args){

	}
}


/*
single  parent->child
multiple parent1+parent2 -> child
multilevel grandparent->parent->child
*/

/*
Abstraction
interface
abstract class*/

abstract class hotstar{
	void signin(){
	//body
	}
	void SIGNOUT(){
	//body
	}
	void free(){
	//body
	}
	abstract void prem();
}

class premium extends hotstar {
	void prem(){
	//premium body
	}
}


/* method overloading*/

1 method same signature/name and return type and in same class

class demo overloading{
	int add(){
	//body
	}
	int add(int a,int b){
	//body
	}
} 



/* method overriding */

abstract class parent{
	int area(int l,int b){
	//body l*b;
	}
	abstract int add(int a,int b); 
}

class child extends parent{
	int area(int r){
	//body 3.14*r*r;
	}
	int add(){
	//body
	}
	
}




