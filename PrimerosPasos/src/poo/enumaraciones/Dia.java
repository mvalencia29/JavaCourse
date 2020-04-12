package poo.enumaraciones;

public class Dia {

    enum Dias {

        LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);

        private String apodo;

        public String getApodo() {
            return apodo;
        }

        private Dias(int numDia){
            switch (numDia){
                case 1:
                    apodo = "Lunes : Que pereza inicio de semana";
                    break;
                case 2:
                    apodo = "Martes : Es martes nose que decir";
                    break;
                case 3:
                    apodo = "Miercoles : Ya vamos a mitad de semana";
                    break;
                case 4:
                    apodo = "Jueves : Ya casi viernes";
                    break;
                case 5:
                    apodo = "Viernes : Viernes a estudiar";
                    break;
                case 6:
                    apodo = "Sabado : Sabado de ejercicio y estudio";
                    break;
                case 7:
                    apodo = "Domingo : Dia de leer un libro";
                    break;
                default:
                    apodo = "Ni idea que dia pusiste JAJA";
            }
        }
    }

}
