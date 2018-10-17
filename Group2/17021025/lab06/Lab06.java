public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram t = new Diagram();
        Layer t1 = new Layer();
        t1.add(new Triangle(3, 4, 5));
        t1.add(new Circle(3));
        t1.add(new Rectangle(4, 5));
        t1.add(new Square(5));
        for(int j = 0;j < t1.size();j ++)
            t1.elementAt(j).info();
        t1.eraseTriangle();
        System.out.println("\nSau khi xoa hinh tam giac: \n");
        for(int j = 0;j < t1.size();j ++)
            t1.elementAt(j).info();
        //test thu eraseCricle
        t.add(t1);
        Layer t2 = new Layer();
        t2.add(new Circle(3));
        t2.add(new Circle(2));
        t2.add(new Triangle(3, 5, 2.5));
        t.add(t2);
        System.out.println("\nTruoc khi xoa hinh tron:\n");
        for(int j = 0;j < t.size();j ++){
            for(int k = 0;k < t.elementAt(j).size();k ++)
                t.elementAt(j).elementAt(k).info();
            System.out.println("");
        }
        t.eraseCricle();
        System.out.println("\nSau khi xoa hinh tron:\n");
        for(int j = 0;j < t.size();j ++){
            for(int k = 0;k < t.elementAt(j).size();k ++)
                t.elementAt(j).elementAt(k).info();
            System.out.println("");
        }
    }

}