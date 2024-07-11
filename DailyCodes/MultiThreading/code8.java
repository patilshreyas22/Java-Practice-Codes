class demo extends Thread{

	public demo(String name){
	
	
			super(name);
			setPriority(Thread.MAX_PRIORITY);
	
	}


}
class ThreadTest {

	public static void main(String args []){
	
		demo obj = new demo("demo thread");

		System.out.println("Demo Thread ID : " +  obj.getId());

		System.out.println(obj.getName());

		System.out.println("Main Thread ID : " + Thread.currentThread().getId());	

		System.out.println(Thread.currentThread().getName());

		obj.start(); // if the thread isnt started yet , the below SOP line will show "false" that it is not alive

		System.out.println("Demo " + obj.isAlive());

		System.out.println("Main " + Thread.currentThread().isAlive());

		System.out.println("Demo Priority " + obj.getPriority());

		System.out.println("Demo State " + obj.getState());
	
	}


}
