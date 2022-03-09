/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author FUSION
 */
public class tabung extends lingkaran implements menghitungruang{
    private double tinggi;
    public tabung(double tinggi,double r)
    {
        super(r);
        this.tinggi = tinggi;
        
    }
       public void sett(double tinggi) {
    this.tinggi = tinggi;
     
  }
 public double gett() {
    return this.tinggi;
  }

 @Override   
 public double volume()
    {
        return(double)(3.14*r*r*tinggi);
    }
 
 @Override   
 public double luaspermukaan()
    {
        return(double)(2 * 3.14 * r * (r+tinggi));
    }
}
