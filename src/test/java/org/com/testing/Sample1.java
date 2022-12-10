package org.com.testing;

public class Sample1 {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		c.test1();
		d.start();
	}

}

class C{
	public void test1() {
		System.out.println(Thread.currentThread().getId());
		for (int i = 0; i < 3; i++) {
			System.out.println("test1");
		}

	}
	
}

class D extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
		for (int i = 0; i < 3; i++) {
			System.out.println("test2");
		}

	}
}
