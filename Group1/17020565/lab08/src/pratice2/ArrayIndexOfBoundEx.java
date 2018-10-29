package pratice2;

public class ArrayIndexOfBoundEx {
    int[] arr = {0};

    public static void main(String[] args) {
        ArrayIndexOfBoundEx arrayIndexOfBoundEx = new ArrayIndexOfBoundEx();
        try {
            arrayIndexOfBoundEx.throwEx(2);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

    public void throwEx(int position) throws ArrayIndexOutOfBoundsException {
        int i = arr[position];
    }
}
