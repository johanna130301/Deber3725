package ClaseCuadrilatero;


public class Cuadrilatero {
   int alto;
   int base;
public Cuadrilatero (){
//constructor//
 }
public Cuadrilatero(int a, int b){
    
//incicializacion//
this.alto=a;
this.base=b;
}
public int volumen(){
    
//formula//
int resultado= this.alto * this.base;
return resultado; 
}
}
