public class House {
    private String add; // dia chi
    private int numOfFloor; // so tang nha

    public House() {
    }

    public House(String add, int numOfFloor) {
        this.add = add;
        this.numOfFloor = numOfFloor;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    public boolean isHigh () {
        if (numOfFloor >= 3) return true;
        else return false;
    }
}
