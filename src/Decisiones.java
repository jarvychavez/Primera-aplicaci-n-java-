public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";
// código que prueba los operadores relacionales
        if (fechaDeLanzamiento >= 2022){
            System.out.println("Péliculas más populares");
        }else{
            System.out.println("Péliculas Retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus") ){
            System.out.println("Disfrute de su pélicula");
        }else{
            System.out.println("Pélicula no disponible para su plan actual");
        }

    }
}