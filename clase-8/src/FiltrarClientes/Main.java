package FiltrarClientes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Cliente> lista = List.of(
		           new Cliente("Nico", 37),
		           new Cliente("Juan", 22),
		           new Cliente("Nair", 30),
		           new Cliente("Mati", 25),
		           new Cliente("Pechu", 63),
		           new Cliente("Lean", 12),
		           new Cliente("Samuel", 27),
		           new Cliente("Pablo", 40),
		           new Cliente("Franco", 30),
		           new Cliente("Paula", 23)
		   );
		 
			   
	   List<Cliente> listaRango = lista.stream()
			   .filter(c -> c.getEdad()>= 30 && c.getEdad()<= 50)
		       .collect(Collectors.toList());
	   
	   System.out.println("Entre 30 y 50 años:");
	   listaRango.forEach(System.out::println);
		
	   System.out.println("------------------------------");
	   
		List<Cliente> listaEdadPar = lista.stream()
				   .filter(c -> c.getEdad() % 2 == 0)
			       .collect(Collectors.toList());
		
		
		System.out.println("Solo edades con números pares:");
		listaEdadPar.forEach(System.out::println);
		
		
		System.out.println("------------------------------");
		
		List<Cliente> listaLimite5 = lista.stream()
				   .limit(5)
			       .collect(Collectors.toList());
		
		
		System.out.println("Limite 5:");
		listaLimite5.forEach(System.out::println);
		
		System.out.println("------------------------------");
			
		
		List<Cliente> testSort = lista.stream()
				   .sorted(Comparator.comparing(Cliente::getNombre).thenComparing(Cliente::getEdad))
			       .collect(Collectors.toList());
				
		System.out.println("Test Sort:");
		testSort.forEach(System.out::println);
		
	}

}
