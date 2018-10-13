/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab051;

/**
 *
 * @author Admin
 */
   class hoaqua {
             String tenhoaqua;
             
             int soluong;
             String nguongoc;
    
   public hoaqua(String Vtenhoaqua,int Vsoluong,String Vnguongoc){
       this.tenhoaqua =Vtenhoaqua;
       
        this.soluong =Vsoluong;
        this.nguongoc =Vnguongoc;
   }
      public void setTenhoaqua(String tenhoaqua){
         this.tenhoaqua=tenhoaqua;
        }
      public String getTenhoaqua(){
            return tenhoaqua;
        }
       public void setNguongoc(String nguongoc){
            this.nguongoc=nguongoc;
        }
      public String getNguongoc(){
            return nguongoc;
        }
      
      public void setSoluong(int soluong){
            this.soluong=soluong;
        }
      public int getSoluong(){
            return soluong;
        }
     String getInfo(){      // TODO
		return soluong+" "+tenhoaqua+" "+nguongoc;
        
    }
}
   class quacam extends hoaqua{
        double giaban;

    public quacam(String Vtenhoaqua, double Vgiaban, int Vsoluong, String Vnguongoc) {
        super(Vtenhoaqua, Vsoluong, Vnguongoc);
        this.giaban=Vgiaban;
    }
        
        public void setGiaban(double giaban){
            this.giaban=giaban;
        }
      public double getGiaban(){
            return giaban;
         
        }
      String getInfocam(){      // TODO
		return soluong+" "+tenhoaqua+" "+nguongoc+" "+giaban;
      }
       
   }
    class camcaophong extends quacam {
        String muivi;

    public camcaophong(String Vtenhoaqua, double Vgiaban, int Vsoluong, String Vnguongoc,String Vmuivi) {
        super(Vtenhoaqua, Vgiaban, Vsoluong, Vnguongoc);
        this.muivi=Vmuivi;
    }
        public void setmuivi(String muivi){
         this.muivi=muivi;
        }
      public String getmuivi(){
            return muivi;
        
        }
        String getinfocamcaophong(){      // TODO
		return soluong+" "+tenhoaqua+" "+nguongoc+" "+giaban+" "+muivi;
        
    }
    }
class camsanh extends quacam{

    public camsanh(String Vtenhoaqua, double Vgiaban, int Vsoluong, String Vnguongoc) {
        super(Vtenhoaqua, Vgiaban, Vsoluong, Vnguongoc);
    }
    

  
}
      class quatao extends hoaqua{
          double chiphi;

    public quatao(String Vtenhoaqua, double Vchiphi, int Vsoluong, String Vnguongoc) {
        super(Vtenhoaqua, Vsoluong, Vnguongoc);
        this.chiphi=Vchiphi;
    }

    public double getChiphi() {
        return chiphi;
    }

    public void setChiphi(double chiphi) {
        this.chiphi = chiphi;
    }
      String getinfotao(){      // TODO
		return soluong+" "+tenhoaqua+" "+nguongoc+" "+chiphi;
         
      }
      }
public class Lab051 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        hoaqua t= new hoaqua("quýt",12,"viet nam");
        System.out.println(t.getInfo());
        
        camcaophong t1=new camcaophong("camcaophong",12.5,100,"viet nam","ngot");
        System.out.println(t1.getinfocamcaophong());
        
        quatao t2 = new quatao("tao",20.0,100,"trung quoc");
        System.out.println(t2.getinfotao());
        
        camsanh t3=new camsanh("camsanh",15.5,50,"viet nam");
        System.out.println(t3.getInfocam());
    }
    
}