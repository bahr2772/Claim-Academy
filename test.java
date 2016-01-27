package test;
//import java.util.Scanner;

public class test
{
		
	static int i = 10;
	String s;
	
	public static void main(String[] args){
	//String variable
	String s2 = "NEW ITEM";
	
	
	System.out.println(s2);
	
	try {
		myMethod(s2, i);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("s");
	
	
		switch(s2){
		case "NEW ITEM" :
			System.out.println("new item requested");
			break;
		case "OLD ITEM" :
			System.out.println("new item requested");
			break;
		default:
			System.out.println("no item requested");
		}	
		
		boolean flag = true;
		while (flag == true){
			System.out.println("flag = true");
			flag = false;
		}
		
		do{
			System.out.println("flag = true in do");
		}
		while(flag == true);
		
		int j = 1;
		int m = 1;
		int a = j++;
		int b = ++m;
		
		System.out.println("a is : " + a);
		System.out.println("b is : " + b);
	
		for(int i = 0; i < 3; ++i){
			System.out.println(i);
		}
		
		int[] numbers = {0,1,2,3};
		for(int value: numbers){
			System.out.println(value);
		}
		flag = true;
		if (s2.equals("NEW ITEM")){
			System.out.println("flag is true");
		}else{
			System.out.println("flag is flase");
			
			
		}
		System.out.println(numbers[2]);
		
		
	}
	
	
	public static int myMethod(String anyString, int k)throws Exception{
		int i = 0;
		boolean b;
		String s = new String();
		
		System.out.println("i: " + i);
		//remove note to run with out exceptions	
		//i++;
			if ( i == 0){
				throw new Exception("i not incremented");
				
			}
	
		return i;
	}
	
}
