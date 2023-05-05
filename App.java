public class App {
    public static void main(String[] args) throws Exception {
       
       //declaración de variables
        double numeroif = 3;
        String resultadoIf = "Numeroif";
        int NumeroWhile = 0;
        String Estacion = "Verano";             
        
        System.out.println("BLOQUE IF");
        //bloque IF
        if (numeroif < 0) {
            resultadoIf = resultadoIf + " es menor que 0";

        } else if (numeroif > 0) {
            resultadoIf = resultadoIf + " es mayor que 0";
        } else {
            resultadoIf = resultadoIf + " es 0";
        }
        System.out.println(resultadoIf);
        System.out.println("");
        
        //bloque While
        System.out.println("BLOQUE WHILE");
        while (NumeroWhile < 3) {
            NumeroWhile++;
            System.out.println(NumeroWhile);

        }
        System.out.println("");
        System.out.println("BLOQUE DO - WHILE");

        //bloque do

        do  {
            NumeroWhile++;
            System.out.println(NumeroWhile);
        } while (NumeroWhile < 4);

        System.out.println("");
        System.out.println("BLOQUE FOR");
        //bloque for
        for (int NumeroFor = 0;NumeroFor < 3;NumeroFor++) {
            System.out.println(NumeroFor);
        }

        System.out.println("");
        System.out.println("BLOQUE SWITCH");
        //Bloque Switch
        switch (Estacion) {
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estación del año");

        }

    }
}
