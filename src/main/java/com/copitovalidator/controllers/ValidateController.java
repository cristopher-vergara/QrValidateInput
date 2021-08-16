package com.copitovalidator.controllers;
import com.copitovalidator.implementation.ValidateImpl;
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
}
