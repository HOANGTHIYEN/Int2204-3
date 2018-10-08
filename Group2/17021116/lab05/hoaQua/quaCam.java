/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaQua;

/**
 *
 * @author 123456789
 */
public class quaCam extends hoaQua {
    String type;
    public quaCam(){};
    public quaCam(String name, String nguonGoc,String type, String ngayNhap, int soLuong, int giaBan ){
        this.name = name;
        this.nguonGoc = nguonGoc;
        this.type = type;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        }
}
