package tugas1;
/**
 *
 * @author FUSION
 */
public class balok extends persegipanjang implements menghitungruang{
    
    private double t;
   
 public  balok(double t,double p,double l)
 {
    super(p,l);
     this.t = t;
       
 }
   public void sett(double t) {
    this.t = t;
     
  }
 public double gett() {
    return this.t;
  }


   
   @Override
    public double volume() {
       return(double)((p*l)*t); 
    }

    /**
     *
     * @return
     */
    @Override
    public double luaspermukaan() {
        return(double)(2*((p*l)+(p*t)+(l*t)));
    }
    
    

    
}
