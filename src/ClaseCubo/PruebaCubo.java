package ClaseCubo;

public class PruebaCubo {
    
    public static void main(String[] args) {
        //declaracion de variable//
        Cubo ob1= new Cubo();
        
        ob1.ancho = 3;
        ob1.alto = 2;
        ob1.prof = 6;
      
      System.out.println("El volumen de la caja es: "+ob1.volumen());
  }
}
