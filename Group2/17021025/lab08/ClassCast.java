public class ClassCast {
    public int converters(Object s) throws ClassCastException{
        return (int)s;
    }
    public static void main(String[] args){
        try {
            ClassCast classCast = new ClassCast();
            System.out.println(classCast.converters("123"));
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
}
