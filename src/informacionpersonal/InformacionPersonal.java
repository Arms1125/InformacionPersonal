
package informacionpersonal;

/**
 *
 * @author arms1125
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Armando",
           apellido_paterno = "Ambrosio",
           apellido_materno = "Nocedal";
    int NumCta = 2271008;
    String Semestre = "Segundo Semestre";
    String Materias1 = "Calculo Diferencial e Integral   Martes y Jueves   7:00 am - 9:00 am";
    String Materias2 = "Programacion   Martes y Jueves 10:00 am - 12:30 pm";
    String Materias3 = "Circuitos Electricos   Martes y Jueves 12:30 pm - 2:30 pm ";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo del alumno es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su numero de cuenta es: " + NumCta);
        System.out.println("El semestre que cursa es: " + Semestre);
        System.out.println("Las materias que cursa son:");
        System.out.println(Materias1);
        System.out.println(Materias2);
        System.out.println(Materias3);

    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
