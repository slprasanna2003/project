package project.project;

/**
 * Hello world!
 *
 */
public class App extends Thread
{
	static class TestSleepMethod1{ 
		int num=8;
		 public void run(){    
		  for(int i=1;i<=10;i++){   
		    try{
		    	Thread.sleep(1000);
		    }
		    catch(InterruptedException e){
		    	System.out.println(e);
		    }    
		    System.out.printf("%d * %d = %d\n",num,i,num*i);    
		  }    
		 }    
		 public static void main(String args[]){    
		  TestSleepMethod1 t1=new TestSleepMethod1();    
		  t1.run();      
		 }    
	}
}