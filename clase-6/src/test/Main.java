package test;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		   Double x = 1200D;
		   Double y = -10D;
		   //sumar(x,y);
		   
		   BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b ;
		   System.out.println(suma.apply(1, 2));
		   
		}

		
		private static void sumar(Double a, Double b)  {
			
			if (a<0 || b< 0) {
				throw new NumeroNegativoExeption("Debe en ser numeros mayores a 0");
			}
		       System.out.println( a + b);

		}


}
