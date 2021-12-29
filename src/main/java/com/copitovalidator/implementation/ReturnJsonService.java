package com.copitovalidator.implementation;

import com.copitovalidator.model.Commerce;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReturnJsonService {

    public List <Commerce> myListCommerce() throws ArrayIndexOutOfBoundsException  {

        List <Commerce> listcommerce = new ArrayList<>() ;

        Commerce com = new Commerce() ;
        com.setStatic_qr_id("30704464076-CRISTIAN-CHECKCRISTIANN");
        com.setPos_type("com.spr");
        com.setCuit("30-70446407-6");
        com.setMcc("5311");
        com.setMerchant_name("merchant_name");
        com.setMerchant_city("merchant_city");
        com.setBranch("cristian");
        com.setTerminal_number(444);
        com.setGuid("PON");
        com.setCheckout("checkCristianN");
        com.setUrl_adq("com.adquirente");
        com.setInfo_adq("info_adquirente");

        listcommerce.add(com);
        System.out.println(listcommerce);
         return listcommerce ;


    }

    public Commerce getCommerceByStatic_qr_id(String static_qr_id){
     Commerce com = new Commerce() ;
        int cont = 0 ;
       for (Commerce c : myListCommerce()){

           if(c.getStatic_qr_id().equals(static_qr_id)){

              com =  myListCommerce().get(cont);

           }
           cont++ ;
       }
        return com ;

    }



}


