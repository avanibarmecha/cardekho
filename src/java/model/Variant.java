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
public class Variant {
    int  variantid ;
   String variantname ;
   int exshowroom_price;

    public int getVariantid() {
        return variantid;
    }

    public void setVariantid(int variantid) {
        this.variantid = variantid;
    }

    public String getVariantname() {
        return variantname;
    }

    public void setVariantname(String variantname) {
        this.variantname = variantname;
    }

    public int getExshowroom_price() {
        return exshowroom_price;
    }

    public void setExshowroom_price(int exshowroom_price) {
        this.exshowroom_price = exshowroom_price;
    }

   

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getModelid() {
        return modelid;
    }

    public void setModelid(int modelid) {
        this.modelid = modelid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
   String features;
   int modelid;
   String modelname;
    
}
