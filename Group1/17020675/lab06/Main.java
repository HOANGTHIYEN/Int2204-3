
public class Main {
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        diagram.layer.listShape.add(new Rectangle(new ToaDo(10,10),false,2,3));
        diagram.layer.listShape.add(new Square(new ToaDo(20,20),true,2));
        diagram.layer.listShape.add(new Triangle(new ToaDo(-15,-20),false,3,3,3));
        diagram.layer.listShape.add(new Circle(new ToaDo(20,-4),true,4));
        for (Shape shape: diagram.layer.listShape){
            System.out.println(shape.name);
        }
        diagram.layer.removeTriangle();
        diagram.removeCircle();
        System.out.println("----------------------");
        for (Shape shape: diagram.layer.listShape){
            System.out.println(shape.name);
        }
        diagram.layer.listShape.get(0).fixToado(1,1);
        System.out.println(diagram.layer.listShape.get(0).getToaDo().getToadoX()+" ; "+diagram.layer.listShape.get(0).getToaDo().getToadoY());
    }
}
