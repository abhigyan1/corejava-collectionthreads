package core.corejava.Thread;

public class RunningCompetition implements Runnable {

	@Override
	public  void run() {
		System.out.println("XX" + Thread.currentThread().getName());
		
		if(Thread.currentThread().getName().startsWith("t1"))
		   for(int meters =0; meters <=200; meters++) {
		      //System.out.println("execution done for 200 meters is: "+ meters+" meters by "+ Thread.currentThread().getName());
		   }
		System.out.println("time taken by "+Thread.currentThread().getName()+"is "+System.currentTimeMillis());
		Thread.currentThread().interrupt(); 
		   // Thread.currentThread().sleep(millis);
		      if(Thread.currentThread().getName().startsWith("t2"))
		            for(int meters =200; meters<=400; meters++) {
	                  //  System.out.println("execution done for 200-400 meters is: "+ meters+" meters by "+ Thread.currentThread().getName());	
	                    }
		      System.currentTimeMillis();
		      Thread.currentThread().interrupt(); 
	                 }
	                }


