package tuan5.bai1;

public class hoaQua {
    protected String nguonGoc;
    protected String chatLuong;

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }
    public void hoaQua(){
        this.nguonGoc="";
        this.chatLuong= "";
    }
}

