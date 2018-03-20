
package prueva;

public class lineatelefonica {
 
    
           private int numerollamadas;
           private int numerominutos;
           private int costollamada;
           
    
           public void inicializar(){
           numerollamadas=0;
           numerominutos=0;
           costollamada=0;
           }
           
           public void reiniciar(){
           numerollamadas=0;
           numerominutos=0;
           costollamada=0;
           }
           
         public double darCostosLlamadas(){
         return costollamada;
         }
         
         public int darNumeroLlamadas(){
         return numerollamadas;
         }
         
         public int darNumeroMinutos(){
         return numerominutos;
         }
         
         public void agregarLlamadaLocal(int minutos){
          numerollamadas= numerollamadas + 1;
           numerominutos= numerominutos + minutos;
           costollamada= costollamada +(minutos * 25);
         }
         
          public void agregarLlamadaLargaDistancia(int minutos){
          numerollamadas= numerollamadas + 1;
           numerominutos= numerominutos + minutos;
           costollamada= costollamada +(minutos * 50);
         }
          
           public void agregarLlamadaCelular(int minutos){
          numerollamadas= numerollamadas + 1;
           numerominutos= numerominutos + minutos;
           costollamada= costollamada +(minutos * 100);
         }
    
    
}
