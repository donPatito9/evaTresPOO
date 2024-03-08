
public class DigitalPersona extends Biometrico
{
 private String huella;
 private int numeroAleatorio;
 private boolean ledAzul;
 private boolean ledRojo;
 private boolean lector;
 private boolean errorLectura;
 private String data;
 public DigitalPersona()
    {
        super();
        this.ledAzul = true;
        this.ledRojo = false;
        this.lector = false;
        this.errorLectura = false;
        this.data = "";
    }
 public DigitalPersona(String huella, boolean ledAzul, boolean ledRojo, boolean lector, boolean errorLectura, String data)
 {
        super(huella,ledAzul, ledRojo, lector, errorLectura, data); 
 }

  public void onHuella()
    {
   this.ledAzul= true;
   this.ledRojo = false;
   System.out.println("Escaneando Huella");
    }
    
  public void onMuestra()
  {
      numeroAleatorio = (int) (Math.random()*(100 - 1)+ 1);
      {
          if(this.huella == huella)
          {
            this.lector = false;
          if(numeroAleatorio > 50)
          {
              this.errorLectura = true;
              System.out.println("Escaneando Huella En Lector DigitalPersona");
              System.out.println("Huella Ingresada Incorrecta");
              
          }
      }
   }
   }
   public void outHuella()
   
   {
       
       if(this.huella == huella)
       {
           this.ledAzul = true;//ledAzul encendido
           this.ledRojo = false;//ledRojo apagado
           this.lector = false;//lector apagado
           System.out.println("Escaneando Huella");
           System.out.println("Huella Correcta Ingresada en Lector DigitalPersona");
       }
       
  }
} 
