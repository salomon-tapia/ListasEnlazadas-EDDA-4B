package ejercicio_listaenlazada_5;

/**
 * @author DiscoDurodeRoer
 */
public class InformeApp {

    public static void main(String[] args) {
        
        ListaEnlazada<Informe> informes=new ListaEnlazada<>();
        
        //Agregamos 10 informes
        for(int i=1;i<=10;i++){
            //Genero los informes
            informes.insertarUltimo(new Informe(i, generaNumeroAleatorio(0,2)));
        }
        
        System.out.println("Primeros diez informes agregados: ");
        
        //Mostramos los ultimos informes
        ListaEnlazada<Informe> aux=new ListaEnlazada<>();
        
        //Paso los datos en una lista llamado aux
        while(!informes.estaVacia()){
            aux.insertarUltimo(informes.devolverUltimo());
            informes.quitarUltimo();
            
            System.out.println(aux.devolverUltimo());
        }
        
        informes = aux;
         
        //Los eliminamos todos, uno a uno
        while(!informes.estaVacia()){
            informes.quitarUltimo();
        }
        
        System.out.println("Informes eliminados");
        
        //Agregamos 5 informes mas
        for(int i=1;i<=5;i++){
             //Genero los informes
            informes.insertarUltimo(new Informe(i, generaNumeroAleatorio(0,2)));
        }
        
        System.out.println("Agregados 5 informes");
        
        //Mostramos los ultimos informes
        aux=new ListaEnlazada<>();
        
        while(!informes.estaVacia()){
            aux.insertarUltimo(informes.devolverUltimo());
            informes.quitarUltimo();
            
            System.out.println(aux.devolverUltimo());
        }
        
        //Dejamos informes con los datos de aux;
        informes = aux;
        aux=null; //La dejamos sin referenciar
        
    }
    
    /**
     * Genera un numero aleatorio entre dos numeros.
     * Entre el minimo y el maximo incluidos
     * @param minimo Número mínimo
     * @param maximo Número máximo
     * @return Número entre minimo y maximo
     */
    public static int generaNumeroAleatorio(int minimo, int maximo){
        
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }   
}