package com.tttt;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Make {
		private static void makeWhat() throws Exception {
			ExecutorService service = Executors.newFixedThreadPool(3);
			
			MyCallable task = new MyCallable(new Love("a", "1", "18"));
			Future<Object> result= service.submit(task);
			//Love love=(Love) result.get();
			//System.out.println(love.toString());
			System.out.println(result.isDone());
			while(!result.isDone()) {
				Thread.sleep(500);
				System.out.println("睡眠1S");
			}
			System.out.println("over");
			
		
		}
		public static void main(String[] args) {
			try {
				makeWhat();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
class MyCallable implements Callable<Object>{
	private Love love;
	
	public MyCallable(Object o) {
		this.love = (Love)o;
	}



	@Override
	public Object call() throws Exception {
		if (love.getAge() .equals("18")) {
			love.setName("远远");
		}
		Thread.sleep(5000);
		System.out.println("xianchengzhong="+love.toString());
		return love;
	}
	
}
