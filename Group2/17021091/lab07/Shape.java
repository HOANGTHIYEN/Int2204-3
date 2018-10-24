/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;
import java.util.Objects;
/**
 *
 * @author Genius
 */
//lop truu tuong shape
abstract class Shape{
    protected Color cl;
    protected coordinates center;
//mau va tam cua hinh
    public Shape(Color cl, coordinates center) {
        this.cl = cl;
        this.center = center;
    }

    public Shape() {
        cl = Color.YELLOW;
        center = new coordinates(0, 0);
    }
    

    public Color getCl() {
        return cl;
    }

    public void setCl(Color cl) {
        this.cl = cl;
    }

    public coordinates getCenter() {
        return center;
    }

    public void setCenter(coordinates center) {
        this.center = center;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shape other = (Shape) obj;
        if (!Objects.equals(this.cl, other.cl)) {
            return false;
        }
        if (!Objects.equals(this.center, other.center)) {
            return false;
        }
        return true;
    }
    
}
