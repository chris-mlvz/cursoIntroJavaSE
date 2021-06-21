public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        // Área de un circulo
        // pi * r2
        System.out.println(circleArea(y));
        // Área de una esfera
        // 4*PI*r2
        System.out.println(sphereArea(y));

        // Volumen de una esfera
        // 4/3 * pi * r3
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS A DOLARES: " + convertToDolar(200, "MXN"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolumen(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
    **/
    public static double convertToDolar(double quantity, String currency) {
        // MXN COP
        switch (currency) {
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
            default:
                break;
        }
        return quantity;
    }
}