/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_05_2;

/**
 *
 * @author Admin
 */

class Square extends Rectangle //hinh vuong
{
    private Double size;

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        width=size;
        length=size;
    }
    Square()
    {
        super();
    }
    Square(Double size)
    {
        this.size=size;
    }
    Square(Double size,String color,Boolean fill)
    {
        super(size,size,color,fill);
        this.size=size;
    }
    public void setWidth(Double size)
    {
        setSize(size);
    }
    public void setLength(Double size)
    {
        setSize(size);
    }
}