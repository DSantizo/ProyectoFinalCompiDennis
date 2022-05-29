package Cod3Direcciones;

/**
 *
 * @author Dennis Santizo
 */
public class CrCod3Direcciones {
    
    private static int temp = 0;
    private static String c3d = "";
    
    public static void reiniciar(){
        temp = 0;
        c3d = "";
    }
    
    public static String generaTemp(){
        return "t$"+temp++;
    }
    

    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    public static String getC3D(){
        return c3d;
    }
    
}
