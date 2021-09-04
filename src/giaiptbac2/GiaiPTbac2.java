/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiptbac2;

/**
 *
 * @author Rin30
 */
public class GiaiPTbac2 {

    /**Giải phương trình bậc 2: ax2 +bx + c =0
     * a : hệ số bậc 2
     * b : hệ số bậc 1
     * c : số hạng tự do
     */
  private float a;
  private float b;
  private float c;

    public GiaiPTbac2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String giaiPT()
    {
        String nghiem="";
        if(a==0)
        {
            nghiem="PT có nghiệm x="+(-b/a);
        }else{
            
           float denta=b*b-4*a*c;
           if(denta>0)
           {
               nghiem="X1="+(-b+Math.sqrt(denta))/(2*a)+"/tX2"+(-b-Math.sqrt(denta))/(2*a);
           }else if(denta==0){
               nghiem="X1=X2"+(-b/(2*a));
           }else{
               nghiem="PT Vô Nghiệm";
           }
        }
        return nghiem;
    }
    
    
}
