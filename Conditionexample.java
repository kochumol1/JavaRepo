package newtest;

public class Conditionexample {

	public static void main(String[] args) {

int a=100;
int b=2000;
  if (a>b) {
  System.out.println("a is the greater "+a);//this will execute when condition is true
  } else {
	  System.out.println("b is greater "+b );//this will execute when condition is false
  }
 int c=3000;
 if (a>b &&a>c) {
	 System.out.println("a is the greatest "+a);
 } else if(b>c) {
	 System.out.println("b is the greatest "+b); 
 }else {
	 System.out.println("c is the greatest "+c);
	 
 }
	}

}
