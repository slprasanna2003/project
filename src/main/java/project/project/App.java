package project.project;

/**
 * Hello world!
 *
 */
public class App extends Thread
{ 
		int x;
		 public int multiply(int num) throws InterruptedException{    
		  for(int i=1;i<=10;i++){   
			Thread.sleep(1000); 
			x=num*i;
		    System.out.printf("%d * %d = %d\n",num,i,x);    
		  }
		return x;    
		 }    
		 public static void main(String args[]) throws InterruptedException
		 {
			 App a=new App();
			 a.multiply(8);
		 }
}