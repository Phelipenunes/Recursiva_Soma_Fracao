
package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public double somafracao(double divisor){
		if( divisor == 1){
			return  1.0;
		}else{
			return 1/divisor + somafracao(divisor - 1);
		}
	}
}
