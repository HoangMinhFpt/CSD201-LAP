/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author hoang minh
 */
public class PhanSo {
    private int mauSo;
    private int tuSo;
    
    public PhanSo(){
    }

    public PhanSo(int mauSo, int tuSo) {
        super();
        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
    
    public PhanSo tichPS(PhanSo ps){
        PhanSo kq= new PhanSo();
        kq.tuSo = this.tuSo * ps.tuSo;
        kq.mauSo= this.mauSo * ps.mauSo;
        return kq;
    }
    
    public PhanSo thuongPS(PhanSo ps){
        PhanSo kq= new PhanSo();
        kq.tuSo = this.tuSo*ps.mauSo;
        kq.mauSo= this.mauSo*ps.tuSo;
        return kq;
    }
    
     
    public void tongPS(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }
      
    public void truPS(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }

    public void display(){
        System.out.println(mauSo + "/" + tuSo);
    }
    
}
