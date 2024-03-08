
public class Microsoft extends Biometrico
{
 private String huella;
 private int numeroAleatorio;
 private boolean ledAzul;
 private boolean lector;
 public Microsoft()
 {
     super();
 }
 public void onHuella()
 {
     if(this.huella == huella )//al colocar huella en sensor 
     {
         this.ledAzul = false;// se apaga ledAzul
         this.lector = true;// se enciende el lector
         System.out.println("Escaneo Lector Microsoft Completado");
    }
 }
 public void onMuestra()
 {
     if(this.huella == huella)
     {
         this.huella = huella;
         System.out.println("Escaneo Completo");
         System.out.println("Huella ingresada");
     }
     else
     {
         System.out.println("Intente Nuevamente");
     }
    }
 
 public void outHuella()
  {
     if(this.huella == null)
       {
           setLedAzul(true);
           setLedRojo(false);
           setLector(false);
           System.out.println("No hay Huellas en el Lector Microsoft");
       }
     
 }
}
