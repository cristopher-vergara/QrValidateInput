package com.copitovalidator.controllers;
import com.copitovalidator.implementation.ReturnJsonService;
import com.copitovalidator.implementation.ValidateImpl;
import com.copitovalidator.model.Commerce;
import com.copitovalidator.model.QrInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")

public class ValidateController {

    @Autowired
    ValidateImpl validateimpl ;

    @Autowired
    ReturnJsonService returnJsonService ;

    @PostMapping("/qr")
    public ResponseEntity validateQR( @Valid @RequestBody QrInit qrInit) {

        return  ResponseEntity.ok().body(validateimpl.validateQR(qrInit)) ;
    }


    @PostMapping("/kongpost")
    public String postKong (){
        String conpost =  "connected this is a post " ;
        return conpost ;
    }

    @GetMapping("/kongget")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;

    }


    @GetMapping(value = "/commerce/{static_qr_id}")
    //public List<Commerce> getCommerceByStatic_qr_id(@PathVariable(value ="static_qr_id") String static_qr_id)
    public Commerce getCommerceByStatic_qr_id(@PathVariable(value ="static_qr_id") String static_qr_id)

    {
        //return  returnJsonService.myListCommerce();
        return returnJsonService.getCommerceByStatic_qr_id(static_qr_id);

    }



}
