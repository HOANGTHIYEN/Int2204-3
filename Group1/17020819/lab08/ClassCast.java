package Bai2;

public class ClassCast {
    public int Number(Object s) throws ClassCastException{          //khai báo 1 ngoại lệ
        return (int)s;
    }
    public static void main(String[] args){
        try {
            ClassCast cla = new ClassCast();
            System.out.println(cla.Number("String"));
        } catch (ClassCastException e) {        //không thể chuyển kiểu object này sang kiểu object khác
            System.out.println(e);
        }
    }
}
