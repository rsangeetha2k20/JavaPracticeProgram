package com.Learning;
//
public class Spy {  //1142--> 1+1+4+2=1*1*4*2=8  is called spy number
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    Spy s=new Spy();
//    int no=1124;  //n is a number that we will take as input .
//    int d;  // d is storing the no of digits.
//    
//    
//    int s=s.sum(no);
//    int p=s.pro(no);
//    if (s==p) {
//    	System.out.println("spy Number");
//    }
//    	else
//    	{
//    	   System.out.println("Not a spy Number");   		
//    }  
//	}
//
//	private int pro(int no) {
//		// TODO Auto-generated method stub
//		
//		while(no>0)  
//		{
//			int d=no%10;
//			pro=pro*d;
//			no=no/10;
//		}
//		return pro;
//	}
//
//
//	private int sum(int no) {
//		// TODO Auto-generated method stub
//		int sum=0;
//		{
//			while(no>0) 
//			{
//				int d=no%10;
//				sum=sum+d;
//				no=no/10;
//			}
//			return sum;
//			}
//	}
//}
//		

//public class Looping1 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int num=1124;
  Spy ll= new Spy();
  ll.find_spy_no(num);

 }

 private void find_spy_no(int number) {
  // TODO Auto-generated method stub
  int num=number;
  int add_total=0;
  int mul_total=1;
  int rem;
  while(num>0)
  {
  rem=num%10; //1124%10=4
  add_total=add_total+rem;//0+4
  mul_total=mul_total*rem;//1*4
  num=num/10;//112
  
  }
  
  if(add_total==mul_total)
  {
   System.out.println(number + " is spy number");
  }
  else
   System.out.println(number + " is not spy number");
  }  
 }