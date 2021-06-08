package ClaseCubo;


public class Cubo {
    int alto;
    int ancho;
    int prof;
//constructor vacio//
 public Cubo (){
     
 }
// constructor//
 public Cubo(int a, int b, int c){
     //incicializacion de variables 
     this.alto=a;
     this.alto=b;
     this.prof=c;
 }
 //método que calcula el volumen 
 public int volumen(){
     //formula volumen 
     int resultado= this.alto + this.ancho + this.prof;
     return resultado;
  }   
 }