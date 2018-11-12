
package Ex1;

public class Cast {
    public int Number(Object s) throws ClassCastException{         
        return (int)s;
    }
    public static void main(String[] args){
        try {
            Cast cla = new Cast();
            System.out.println(cla.Number("String"));
        } catch (ClassCastException e) {        
            System.out.println(e);
        }
    }
}
