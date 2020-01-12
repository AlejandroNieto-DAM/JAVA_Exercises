/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahebrassemaforos;

/**
 *
 * @author alejandronieto
 */
public class HebraProductora implements Runnable {
    
  
    public Thread mythread;
    int termina;
    Buffer buffer;
    String id;
    
    HebraProductora(String id, int termina, Buffer buffer){
        this.id = id;
        this.termina = termina;
        this.buffer = buffer;
        mythread = new Thread(this, this.id);
    }

    @Override
    public void run() {
        if(termina == 0){
            while(true){
                buffer.producir(id);
            }
        } else {
            buffer.producir(id);
        }
    }
    
    
    
}
