import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ListarPersonasFabucciNicolas {

    public static void main(String[] args) {
        
        ArrayList<ClasePersona> lista = new ArrayList<>();

        lista.add(new ClasePersona("Nicolas","Fabucci"));
        lista.add(new ClasePersona("Roberto","Garcia"));
        lista.add(new ClasePersona("Homero","Simpson"));
        lista.add(new ClasePersona("Juan","Alvarez"));
        lista.add(new ClasePersona("Pedro","Sanchez"));
        
        ordenarPorNombre(lista);      
        System.out.println("-------------------------"); 
        ordenarPorApellido(lista);
        System.out.println("-------------------------");
        ordenarInversoPorApellido(lista);
        
        
    }
    
    private static void ordenarPorNombre(ArrayList<ClasePersona> lista) {
        System.out.println("LISTA ORDENADA POR NOMBRE:"); 
        //Function<ClasePersona, String> nombre = ClasePersona::getNombre;
        //Function<ClasePersona, String> apellido = ClasePersona::getApellido;
        
        Comparator<ClasePersona> sNombre = Comparator.comparing(ClasePersona::getNombre)
                                            .thenComparing(ClasePersona::getApellido);
        
        lista.stream()
            .sorted(sNombre)
            .forEach(System.out::println);
        
    }
    
    private static void ordenarPorApellido(ArrayList<ClasePersona> lista) {
        System.out.println("LISTA ORDENADA POR APELLIDO:"); 
        
        Comparator<ClasePersona> sApellido = Comparator.comparing(ClasePersona::getApellido)
                                                .thenComparing(ClasePersona::getNombre);
        
        lista.stream()
            .sorted(sApellido)
            .forEach((p) -> System.out.println(p.apellido + ' ' + p.nombre));
        
    }
    
    private static void ordenarInversoPorApellido(ArrayList<ClasePersona> lista) {
        System.out.println("LISTA INVERSAMENTE POR APELLIDO:"); 
                 
        
        Comparator<ClasePersona> sApellido = Comparator.comparing(ClasePersona::getApellido)
                                                    .thenComparing(ClasePersona::getNombre);
        
        Collections.sort(lista, Collections.reverseOrder(sApellido));        
        
        lista.forEach((p) -> System.out.println(p.apellido + ' ' + p.nombre));
    }

}
