
public abstract class Biometrico
{
    private String huella;
    private boolean ledAzul;
    private boolean ledRojo;
    private boolean lector;
    private boolean errorLectura;
    private String data;

    public Biometrico ()
    {
        this.huella = huella;
        this.ledAzul = true;
        this.ledRojo = false;
        this.lector = false;
        this.errorLectura = false;
        this.data = "";
    }  
    
    public Biometrico(String huella, boolean ledAzul, boolean ledRojo, boolean lector, boolean errorLectura, String data)
       {
        //constructor con parametros
        this.huella = huella;
        this.ledAzul = ledAzul;
        this.ledRojo = ledRojo;
        this.lector = lector;
        this.errorLectura = errorLectura;
        this.data = "";
           
        }
        public String getHuella(String huella)
    {
        return huella;
    }
    
    public boolean getLedAzul()
    {
        return ledAzul;
    }
    
    public boolean getLedRojo()
    {
        return ledRojo;
    }
    
    public boolean getLector()
    {
        return lector;
    }
    public boolean getErrorLectura()
    {
        return errorLectura;
    }
    public String getData()
    {
       return data; 
    }
    public void setLedRojo(boolean value)
    {
        this.ledRojo = value;
    }
    public void setLector(boolean value)
    {
        this.lector = value;
    }
    
    public void setErrorLectura(boolean value)
    {
        this.errorLectura = value;
    }
    
    public void setHuella(String value)
    {
        this.huella = huella;
    }
    public void setLedAzul(boolean value)
    {
        this.ledAzul = value;
    }
    public void setData(String value)
    {
        this.data = value;
    }
    
    public abstract void onHuella();
    public abstract void onMuestra();
    public abstract void outHuella();
    
}
