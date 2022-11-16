package pt.dneves.exception;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Exercicios {

	
	public void exercio1() {
		
		try {
			// a1();
			// a2();
			a3();
			b();
		} catch(NoSuchFileException e) {
			c();
		} catch(IOException e) {
			d();
		} finally {
			e();
		}
		
		f();
		
	}
	
	public void a1() throws IOException {
		
		boolean test = false;
		
		if(test) {
			throw new IOException();
		}
		
	}

	public void a2() throws IOException {
		
		boolean test = true;
		
		if(test) {
			throw new NullPointerException();
		}
		
		throw new IOException();
		
	}

	public void a3() throws NoSuchFileException {
		
		boolean test = true;
		
		if(test) {
			throw new NoSuchFileException("file.txt");
		}
		
	}
	
	public void exercio2() {
		
		try {
			a4();
			b();
		} catch(NoSuchFileException e) {
			c();
		} catch(Exception e) {
			d();
			return;
		} finally {
			e();
		}
		
		f();
		
	}
	
	public void a4() throws IOException {
		
		boolean test = true;
		
		if(test) {
			throw new IOException("file.txt");
		}
		
	}


	public void b() {

	}

	public void c() {
		
	}

	public void d() {
		
	}

	public void e() {
		
	}

	public void f() {
		
	}
	
}
