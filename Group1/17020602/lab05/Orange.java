/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Do Tuan Bac
 */
public class Orange extends Fruit {
    String kind_orange;

    public Orange(String Kind) {
        super(Kind);
    }

    public String getKind_orange() {
        return kind_orange;
    }

    public void setKind_orange(String kind_orange) {
        this.kind_orange = kind_orange;
    }
}
