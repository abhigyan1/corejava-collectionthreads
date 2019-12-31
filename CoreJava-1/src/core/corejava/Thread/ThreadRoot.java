package core.corejava.Thread;

public class ThreadRoot {
public static void main(String[] args) 
{
	RunningCompetition runningComp = new RunningCompetition();
	//ThreadGroup
	ThreadGroup threadGroup_USA = new ThreadGroup("USA");
	ThreadGroup threadGroup_CAN = new ThreadGroup("CAN");
	ThreadGroup threadGroup_IND = new ThreadGroup("IND");
	ThreadGroup threadGroup_BZL = new ThreadGroup("BZL");
	ThreadGroup threadGroup_MEX = new ThreadGroup("MEX");
	
	//Thread instances
	Thread t1_USA = new Thread(threadGroup_USA, runningComp, "t1_USA");
	Thread t2_USA = new Thread(threadGroup_USA, runningComp,"t2_USA");
	Thread t1_CAN = new Thread(threadGroup_CAN, runningComp,"t1_CAN");
	Thread t2_CAN = new Thread(threadGroup_CAN, runningComp,"t2_CAN");
	Thread t1_IND = new Thread(threadGroup_IND, runningComp,"t1_IND");
	Thread t2_IND = new Thread(threadGroup_IND, runningComp, "t2_IND");
	Thread t1_BZL = new Thread(threadGroup_BZL, runningComp, "t1_BZL");
	Thread t2_BZL = new Thread(threadGroup_BZL, runningComp, "t2_BZL");
	Thread t1_MEX = new Thread(threadGroup_MEX, runningComp, "t1_MEX");
	Thread t2_MEX = new Thread(threadGroup_MEX, runningComp, "t2_MEX");
try {
	t1_USA.start();
	t1_USA.sleep(1000);
	t1_CAN.start();
	t1_CAN.sleep(1000);
	t1_IND.start();
	t1_IND.sleep(1000);
	t1_BZL.start();
	t1_BZL.sleep(1000);
	t1_MEX.start();
	t1_MEX.sleep(1000);
	t2_USA.start();
	t2_USA.sleep(1000);
	t2_CAN.start();
	t2_CAN.sleep(1000);
	t2_IND.start();
	t2_IND.sleep(1000);
	t2_BZL.start();
	t2_BZL.sleep(1000);
	t2_MEX.start();
	t2_MEX.sleep(1000);
}
catch(Exception e)
{
System.out.println("Exception"+e.getMessage());	
}
}
}
