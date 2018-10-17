/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author MANH HOANG
 */
public class Shape {
    protected String color="red";
    protected boolean filled=true;
    protected Vitri vitri;
    /**
     * @param args the command line arguments
     */
    
    public Shape() {
        
    }
    
    public Shape(String color,boolean filled,Vitri vitri) {
        this.color=color;
        this.filled=filled;
        this.vitri=vitri;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * @return the vitri
     */
    public Vitri getVitri() {
        return vitri;
    }

    /**
     * @param vitri the vitri to set
     */
    public void setVitri(Vitri vitri) {
        this.vitri = vitri;
    }
    
    public void dichuyen(double dodai, String huong){
        switch (huong) {
            case "bac":
                vitri.setY(vitri.getY() + dodai);
                break;
            case "nam":
                vitri.setY(vitri.getY() - dodai);
                break;
            case "dong":
                vitri.setX(vitri.getX() + dodai);
                break;
            case "tay":
                vitri.setX(vitri.getX() - dodai);
                break;
            default:
                break;
        }
    }
    public void info(){
        System.out.println("");
    }
}
