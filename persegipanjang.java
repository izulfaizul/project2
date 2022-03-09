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
public class persegipanjang implements menghitungbidang {
    //persegipanjang mengimplementasikan class mengitungbidang
    double p;
    double l;
  //constructor
    public persegipanjang(double p, double l) {
       this.p = p;
       this.l = l;
    }
 //membuat method luas dan keliling pada menghitungbidang
@Override   
   public double luas() {
        
        return (double) (p*l);
        
    }

 @Override
    public double keliling() {
        
         return (double) (2*(p+l));
      
    }
    
}
