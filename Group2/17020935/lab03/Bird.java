/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author admin
 */
public class Bird {
    private String name;
    private String size;
    public void setname(String a){
        this.name=a;
    }
    public void setsize(String a){
        this.size=a;
    }
    public String getname(){
        return name;
    }
    public String getsize(){
        return size;
    }
    public void go(){
        System.out.println("cuc cu");
    }
}
