
/**
 * Write a description of class Reloj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reloj
{
    private int hora, min, seg;
    
    public Reloj(int h, int m, int s)
    {
        hora = h;
        min = m;
        seg = s;
    }
        
    public int getHora()
    {
        return hora;
    }
    
    public int getMin()
    {
        return min;
    }
    
    public int getSeg()
    {
        return seg;
    }
    
    public void aumentarSeg()
    {
        int ns = this.seg+1;
        if(ns>59)
        {
            this.seg=0;
            int nm=this.min+1;
            if(nm>59)
            {
                this.min=0;
                int nh = this.hora+1;
                if(nh>23)
                {
                    this.hora=0;
                }
                else
                {
                    this.hora++;
                }
            }
            else
            {
                this.min++;
            }
        }
        else
        {
            this.seg++;
        }        
    } 
    
    public void disminuirSeg()
    {
        int ns = this.seg-1;
        if(ns<0)
        {
            this.seg=59;
            int nm=this.min-1;
            if(nm<0)
            {
                this.min=59;
                int nh = this.hora-1;
                if(nh<0)
                {
                    this.hora=23;
                }
                else
                {
                    this.hora--;
                }
            }
            else
            {
                this.min--;
            }
        }
        else
        {
            this.seg--;
        } 
    }
    
    public static void main(String[] args)
    {
       Reloj minireloj = new Reloj (1, 22 ,59);
       System.out.println("La hora del reloj es: " + minireloj.getHora() + " - " + minireloj.getMin() + " - " + minireloj.getSeg());
       minireloj.aumentarSeg();
       System.out.println("La hora del reloj es: " + minireloj.getHora() + " - " + minireloj.getMin() + " - " + minireloj.getSeg());
       minireloj.disminuirSeg();
       
       System.out.println("La hora del reloj es: " + minireloj.getHora() + " - " + minireloj.getMin() + " - " + minireloj.getSeg());
       
    }
    
}
