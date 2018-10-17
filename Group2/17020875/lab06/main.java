public class main {
    public static void main(String[] args) {
        Diagram d = new Diagram();
        //test eraseTriangle
        Layer l1 = new Layer();
        l1.add(new Triangle(3, 4, 5));
        l1.add(new Cricle(3));
        l1.add(new Rectangle(4, 5));
        l1.add(new Square(5));
        d.add(l1);
        for(int j = 0;j < l1.size();j ++)
            l1.elementAt(j).info();
        l1.eraseTriangle();
        System.out.println("\nSau khi xoa hinh tam giac:");
        for(int j = 0;j < l1.size();j ++)
            l1.elementAt(j).info();
        //test eraseCricle
        Layer l2 = new Layer();
        l2.add(new Cricle(3));
        l2.add(new Cricle(2));
        l2.add(new Triangle(3, 5, 2.5));
        d.add(l2);
        System.out.println("\nTruoc khi xoa hinh tron:");
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k < d.elementAt(j).size();k ++)
                d.elementAt(j).elementAt(k).info();
        }
        d.eraseCricle();
        System.out.println("\nSau khi xoa hinh tron:");
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k < d.elementAt(j).size();k ++)
                d.elementAt(j).elementAt(k).info();
        }
    }
}
