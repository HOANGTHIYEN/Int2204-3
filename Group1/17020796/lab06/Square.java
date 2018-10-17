
//Hình vuông

public class Square extends Rectangle {
    
    public Square() {}
    
    public Square(ToaDo dinhGocTren, ToaDo dinhGocDuoi) {
        super(dinhGocTren, dinhGocDuoi);
    }

    public Square(String color, boolean filled, ToaDo dinhGocTren, ToaDo dinhGocDuoi) {
        super(color, filled, dinhGocTren, dinhGocDuoi);
    }
}