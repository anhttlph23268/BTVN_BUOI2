/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entity;

/**
 *
 * @author lananh
 */
public class Sach {

    private String tenSach;
    private String tenTacGia;
    private int theLoai;
    private int namIn;
 

    public static void main(String[] args) {

    }

    public Sach() {
    }

    public Sach(String tenSach, String tenTacGia, int theLoai, int namIn) {
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.theLoai = theLoai;
        this.namIn = namIn;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(int theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamIn() {
        return namIn;
    }

    public void setNamIn(int namIn) {
        this.namIn = namIn;
    }
    public String checkTheLoai(int theloai) {
        if (theloai == 1) {
            return "Tiểu thuyết";
        } 
            return "Truyện ngắn";
        
        }
    }


