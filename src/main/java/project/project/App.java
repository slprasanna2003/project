package project.project;

/**
 * Hello world!
 *
 */
public class App extends Thread
{ 
		 public void multiply(int num) throws InterruptedException{    
		  for(int i=1;i<=10;i++){   
			Thread.sleep(1000); 
		    System.out.printf("%d * %d = %d\n",num,i,num*i);    
		  }
		 }    
}