public class App {
    public static void main(String[] args) throws Exception {
        //parte 1
        
        int suma;
        suma = Sumame (1,5,8);
        System.out.println("suma de 1,5 y 8 ");
        System.out.println(suma);
        //parte 2

        coche micoche = new coche();
        micoche.añadirpuerta();
        System.out.println("numero de puertas del vehículo");
        System.out.println(micoche.Puertas);
    }

    public static int Sumame(int a, int b, int c) {
        int resultado;
        resultado =a+b+c;
        return resultado;
        
    }

    public static void sumapuertas() {

    }
    public static class coche{
        
        String Marca;
        String Modelo;
        int Puertas = 0;
        int cubicaje;
        String Combustible;
        public void añadirpuerta() {
            this.Puertas++;
        }
    }

}
