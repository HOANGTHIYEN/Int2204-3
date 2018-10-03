/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Admin
 */
public class President {
    private String name;
    private String nation;
    private int age;
    private int getHand;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getNation(){
        return nation;
    }
    public void setNation(String nation){
        this.nation = nation;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public int getHand(){
        return getHand;
    }
    public void setHand(int getHand){
        this.getHand = getHand;
    }
}
