/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL 1
 */
public class Brand {
    int brandid;

    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }
    String brandname;
    String brandlogo;

    public String getBrandlogo() {
        return brandlogo;
    }

    public void setBrandlogo(String brandlogo) {
        this.brandlogo = brandlogo;
    }
    
}
