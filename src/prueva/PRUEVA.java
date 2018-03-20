
package prueva;

import prueva.lineatelefonica;

public class PRUEVA {

    private lineatelefonica linea1;
    private lineatelefonica linea2;
    private lineatelefonica linea3;     
    
    public void inicializar()
    {
    linea1 = new lineatelefonica();
    linea1.inicializar();
    
    linea2 = new lineatelefonica();
    linea2.inicializar();
    
    linea3 = new lineatelefonica();
    linea3.inicializar();
    }
    
    public lineatelefonica darlinea1(){
    return linea1;
    }
    
    public lineatelefonica darlinea2(){
    return linea2;
    }
    
    public lineatelefonica darlinea3(){
    return linea3;
    }
    
    public void agregarllamadalocallinea1(int minutos){
    linea1.agregarLlamadaLocal(minutos);
    }
    
    public void agregarllamadalocallinea2(int minutos){
    linea2.agregarLlamadaLocal(minutos);
    }
    
    public void agregarllamadalocallinea3(int minutos){
    linea3.agregarLlamadaLocal(minutos);
    }
    
    public void agregarllamadalargadistancialinea1(int minutos){
    linea1.agregarLlamadaLargaDistancia(minutos);
    }
    
    public void agregarllamadalargadistancialinea2(int minutos){
    linea2.agregarLlamadaLargaDistancia(minutos);
    }
    
    public void agregarllamadalargadistancialinea3(int minutos){
    linea3.agregarLlamadaLargaDistancia(minutos);
    }
    
    public void agregarllamadacelularlinea1(int minutos){
    linea1.agregarLlamadaCelular(minutos);
    }
    
    public void agregarllamadacelularlinea2(int minutos){
    linea2.agregarLlamadaCelular(minutos);
    }
    
    public void agregarllamadacelularlinea3(int minutos){
    linea3.agregarLlamadaCelular(minutos);
    }
    
    public int dartotalnumerollamadas(){
    return linea1.darNumeroMinutos() + linea2.darNumeroLlamadas() + linea3.darNumeroLlamadas();
    }
    
    public int dartotalminutos(){
    return linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos();
    }
    
    public double dartotalcostollamadas(){
    return linea1.darCostosLlamadas() + linea2.darCostosLlamadas() + linea3.darCostosLlamadas();
    }
    
    public double darcostopromediominutos(){
    return ( linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos())/3;
    }
    
    public void reinicializar(){
    linea1.reiniciar();
    linea2.reiniciar();
    linea3.reiniciar();
    }
}
