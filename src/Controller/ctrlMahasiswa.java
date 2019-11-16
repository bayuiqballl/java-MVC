/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mahasiswa;
import View.frmMahasiswa;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ctrlMahasiswa {
    private frmMahasiswa frm;
    private Mahasiswa mhs;
    
    public ctrlMahasiswa(frmMahasiswa frm){
        this.frm = frm;
    }
    
    public void simpan(){
        mhs = new Mahasiswa();
        mhs.setNim(frm.getNim().getText());
        mhs.setNama(frm.getNama().getText());
        mhs.setUmur(Integer.parseInt(frm.getUmur().getText()));
        mhs.setAlamat(frm.getAlamat().getText());
        if(frm.getPria().isSelected() && !frm.getWanita().isSelected()){
            mhs.setJk("Pria");
        }else if(!frm.getPria().isSelected() && !frm.getWanita().isSelected()){
            mhs.setJk("Wanita");
        }
        JOptionPane.showMessageDialog(frm, mhs.getNim()+"\n"+mhs.getNama()+"\n"+mhs.getUmur()+"\n"+mhs.getJk()+"\n"+mhs.getAlamat());
    }
    
}
