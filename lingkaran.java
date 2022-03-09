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
public class lingkaran implements menghitungbidang  {

double r;
  

     public lingkaran(double r) {
       this.r = r;
    }

@Override  
    public double luas() {
        
        return (double) (r*r*3.14);
        
    }

   @Override
    public double keliling() {
        
         return (double) (2*3.14*r);
      
    }
   
}
