public class ClassCast {
    public int Convert(Object string) throws ClassCastException{
        return (int)string;
    }

    public static void main(String[] args) {
        ClassCast classCast = new ClassCast();
        try{
            System.out.println(classCast.Convert("Hanh"));
        }
        catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
}
