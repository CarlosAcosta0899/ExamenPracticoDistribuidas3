package pe.edu.exanum;

import java.util.Random;

public class Productor implements Runnable {
	 Cola colaCompartida;
	 Random   generador;
	 
    public Productor(Cola cola){
            this.colaCompartida=cola;
            this.generador =  new Random();
    }
    @Override
    public void run() {
       while (true){
               int num=generador.nextInt(10);
               while (colaCompartida.encolar(num)==false){
               	try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
               } /*Fin del while*/

               System.out.println("Productor encoló el numero:"+num);
       } /*Fin del while externo*/
    } /*Fin de run()*/
}
