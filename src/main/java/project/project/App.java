package project.project;

/**
 * Hello world!
 *
 */
public class App 
{
	static class TestSleepMethod1 extends Thread{ 
		int num=8;
		 public void run(){    
		  for(int i=1;i<5;i++){   
		  // the thread will sleep for the 500 milli seconds   
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}    
		    System.out.printf("%d * %d = %d\n",num,i,num*i);    
		  }    
		 }    
		 public static void main (String args[]){    
		  TestSleepMethod1 t1=new TestSleepMethod1();    
		  t1.start();      
		 }    
	}
}