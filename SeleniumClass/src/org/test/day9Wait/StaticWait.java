package org.test.day9Wait;

public class StaticWait {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
	}

}
