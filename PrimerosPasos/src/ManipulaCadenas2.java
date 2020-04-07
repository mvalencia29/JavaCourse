public class ManipulaCadenas2 {
    public  static void main(String[] args){
        String alumno1, alumno2;
        alumno1 = "Miguel";
        alumno2 = "Miguel";

        System.out.println(alumno1.equals(alumno2));

        String alumno3, alumno4;
        alumno3 = "Miguel";
        alumno4 = "miguel";

        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
