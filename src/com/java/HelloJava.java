package com.java;

public class HelloJava {

	public static void main(String[] args) {
		
		int idade=10;
		double preco=10.5;
		char sexo='M';
		boolean temFilhos=true;
		
		System.out.println("Hello Java");
		
		System.out.println(idade);
		System.out.println(preco);
		System.out.println(sexo);
		System.out.println(temFilhos);
		
		/*cast automatico*/
		int x=10;
		double d=x;
		long l=x;
		float f=x;
		short s=20;
		x=s;
		//-----------------//
		
		double valorDouble=9.99;
		int valorInt=(int)valorDouble; //cast explicito/manual
		System.out.println(valorInt);
	}

}
