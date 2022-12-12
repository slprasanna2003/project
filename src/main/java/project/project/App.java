package project.project;

/**
 * Hello world!
 *
 */
public class App extends Thread
{ 
		 public int multiply(int num) throws InterruptedException{ 
			 int i;
			 int p;
		  for(i=1;i<=10;i++){   
		    Thread.sleep(1000); 
		    p=num*i;
		    System.out.printf("%d * %d = %d\n",num,i,p);
		  }
		  return 0;
		 }      
		 public static void main(String args[]) throws InterruptedException {
			 App m=new App();
			 m.multiply(8);
		 }
}