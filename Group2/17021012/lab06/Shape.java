package bai_tap_lap06;

public abstract class Shape {
	String color;
    boolean filled;
    Toadodiem td;
    
    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled, Toadodiem td) {
        this.color = color;
        this.filled = filled;
        this.td = td;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Toadodiem getTd() {
        return td;
    }

    public void setTd(Toadodiem td) {
        this.td = td;
    }
//    public void dichuyen(double dodai, String huong){
//        switch (huong) {
//            case "bac":
//                td.setY(td.getY() + dodai);
//                break;
//            case "nam":
//                td.setY(td.getY() - dodai);
//                break;
//            case "dong":
//                td.setX(td.getX() + dodai);
//                break;
//            case "tay":
//                td.setX(td.getX() - dodai);
//                break;
//            default:
//                break;
//        }
//    }
    public void info(){
        System.out.println("");
    }
}

