package com.copitovalidator.model;


import java.time.ZonedDateTime;
import java.util.Date;

public class Commerce {

    private int id;
    private String static_qr_id ;
    private String branch;
    private String checkout;
    private int terminal_number;
    private String cbu;
    private String mcc;
    private String merchant_name;
    private String merchant_city;
    private String guid;
    private String segmento_inicial;
    private String iva_exempt;
    private String pos_type;
    private String currency;
    private String url_adq;
    private String info_adq;
    private String cuit;
    private ZonedDateTime fechaAlta;
    private Date fechaBaja;
    private Date fechaModificacion;
    private boolean esquemaGratuito;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatic_qr_id() {
        return static_qr_id;
    }

    public void setStatic_qr_id(String static_qr_id) {this.static_qr_id = static_qr_id;}

    public String getBranch() {return branch;}

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public int getTerminal_number() {
        return terminal_number;
    }

    public void setTerminal_number(int terminal_number) {
        this.terminal_number = terminal_number;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String getMerchant_city() {
        return merchant_city;
    }

    public void setMerchant_city(String merchant_city) {
        this.merchant_city = merchant_city;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getSegmento_inicial() {
        return segmento_inicial;
    }

    public void setSegmento_inicial(String segmento_inicial) {
        this.segmento_inicial = segmento_inicial;
    }

    public String getIva_exempt() {
        return iva_exempt;
    }

    public void setIva_exempt(String iva_exempt) {
        this.iva_exempt = iva_exempt;
    }

    public String getPos_type() {
        return pos_type;
    }

    public void setPos_type(String pos_type) {
        this.pos_type = pos_type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUrl_adq() {
        return url_adq;
    }

    public void setUrl_adq(String url_adq) {
        this.url_adq = url_adq;
    }

    public String getInfo_adq() {
        return info_adq;
    }

    public void setInfo_adq(String info_adq) {
        this.info_adq = info_adq;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public ZonedDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(ZonedDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public boolean isEsquemaGratuito() {
        return esquemaGratuito;
    }

    public void setEsquemaGratuito(boolean esquemaGratuito) {
        this.esquemaGratuito = esquemaGratuito;
    }

}