
public class AppTest
{
    private DigitalPersona l1;
    private Microsoft l2;
    
    public  static  void main(String[] args)
    {
     Biometrico l1 = new DigitalPersona();
     Biometrico l2 = new Microsoft();
      
      System.out.println("Resultados DigitalPersona");
      l1.onHuella();//colocar dedo
      l1.onMuestra();//tomar huella
      l1.outHuella();//sacar dedo
      
      System.out.println("Resultados Microsoft");
      l2.onHuella();
      l2.onMuestra();
      l2.outHuella();
     
    }
}
