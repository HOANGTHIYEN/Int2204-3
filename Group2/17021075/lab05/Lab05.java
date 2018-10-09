package lab05;

class HoaQua
{                //lớp Hoa Qua
    public int number;

    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }
}

class QuaCam extends HoaQua 
{         //lop Qua Cam
    public int costQuaCam;
    public String dayQuaCam;

    public int getCostQuaCam() 
    {
        return costQuaCam;
    }

    public void setCostQuaCam(int costQuaCam) 
    {
        this.costQuaCam = costQuaCam;
    }
    public String getDayQuaCam() 
    {
        return dayQuaCam;
    }

    public void setDayQuaCam(String dayQuaCam) 
    {
        this.dayQuaCam = dayQuaCam;
    }
}

class QuaTao extends HoaQua   //lop Qua Tao
{         
    public int costQuaTao;
    public String dayQuaTao;

    public int getCostQuaTao() 
    {
        return costQuaTao;
    }

    public void setCostQuaTao(int costQuaTao) 
    {
        this.costQuaTao = costQuaTao;
    }

    public String getDayQuaTao() 
    {
        return dayQuaTao;
    }

    public void setDayQuaTao(String dayQuaTao) 
    {
        this.dayQuaTao = dayQuaTao;
    }
}

class CamCaoPhong extends QuaCam  //lop Cam Cao Phong
{	  
	public String xuatxuC;
    public String getXuatXuC() 
    {
        return xuatxuC;
    }

    public void setXuatXu(String xuatxuC) 
    {
        this.xuatxuC = xuatxuC;
    }
}
class CamSanh extends QuaCam //lop cam Sanh
{      
	public String xuatxuS;
    public String getXuatXuS() 
    {
        return xuatxuS;
    }

    public void setXuatXu(String xuatxuS) 
    {
        this.xuatxuS = xuatxuS;
    }
}
public class Lab05
{
	public static void main(String[] args) 
	{
	CamCaoPhong cp = new CamCaoPhong();
	CamSanh s = new CamSanh();
	cp.setCostQuaCam(10);
	cp.setNumber(100);
	s.setCostQuaCam(12);
	s.setNumber(200);
	System.out.println("Gia cam cao phong: " + cp.getCostQuaCam()+"k/kg");
	System.out.println("Gia cam sanh: " + s.getCostQuaCam()+"k/kg");
	System.out.println("So luong cam cao phong: " + cp.getNumber()+"kg");
	System.out.println("So luong cam sanh: " + s.getNumber()+"kg");
	}
}
