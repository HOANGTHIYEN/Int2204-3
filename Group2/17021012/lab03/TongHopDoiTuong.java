/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonghopdoituong;

/**
 *
 * @author Nguyễn Thúy
 */
public class TongHopDoiTuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GiaoVien gv1= new GiaoVien("Co Hien", "Kim Bai", "Toan",32);
        gv1.GiangBai("Co Hien");
        System.out.println(gv1.hoten+" "+gv1.getMonday()+" "+gv1.getTuoi());
        System.out.println("\n");
        
        Boss cun= new Boss();
        cun.TrongNha();
        System.out.println("\n");
        
        LapTrinhVien coder= new LapTrinhVien("Anh A", "NHT28099"," phu trach lap trinh phan mem",18, 28);
        System.out.println(coder.getTenLTV()+" "+coder.getCongviec());
        coder.CachLv();
        System.out.println("\n");
        
        ChuTichNuoc president = new ChuTichNuoc("Ho Chi Minh",79,"1960-1969");
        System.out.println(president.tenCT+" "+president.tuoi+" "+president.nhiemki);
        System.out.println("\n");
        
        Student hs = new Student("Nguyen Hong Thai", "17021012", "Gioi", 18);
        System.out.println(hs.getTenSV()+" "+hs.getMaSV()+" "+hs.getHocluc()+" "+hs.tuoi);
        System.out.println("\n");
        
        Dodac dd= new Dodac("Sofa", "Ha Noi", "1/1/2018");
        System.out.println(dd.getTendd()+" " + dd.getNoiSX()+" " +dd.namht);
        System.out.println("\n");
        
        Nhacua home = new Nhacua("TP Ho Chi Minh", 1890);
        System.out.println(home.getDiachi()+ " "+ home.getNam());
        System.out.println("\n");
            
        Sport thethao = new Sport("Bong da", 23, 15) ;
        System.out.println(thethao.getName()+" "+thethao.getSonguoi()+" "+thethao.getThoigian());
        System.out.println("\n");
        
        Travel dulich = new Travel("Da nang" , "28/09/2018" , 19);
        System.out.println(dulich.getDiadiem()+ " "+ dulich.getThoigian() + " " +dulich.getSonguoi());
        System.out.println("\n");
        
        HocTap study = new HocTap("Lap trinh huong doi tuong", 278000, 1999);
        System.out.println(study.getTenmonhoc() + " " + study.getSotien() + " " +study.getSotrang());
        System.out.println("\n");
        
        }
        
        
        
        
    }
    
    