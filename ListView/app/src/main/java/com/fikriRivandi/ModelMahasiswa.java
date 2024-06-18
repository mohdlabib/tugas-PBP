package com.fikriRivandi;

public class ModelMahasiswa {
    private int mImage;
    private String nama;
    private String nim;


    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public ModelMahasiswa(int mImage, String nama, String nim) {
        this.mImage = mImage;
        this.nama = nama;
        this.nim = nim;


    }
}