package com.copitovalidator.controllers;
import com.copitovalidator.implementation.ValidateImpl;
import com.copitovalidator.model.QrInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("recieve/json")

public class ValidateController {

    @Autowired
    ValidateImpl validateimpl ;

    @PostMapping("/qr")
    public ResponseEntity validateQR( @Valid @RequestBody QrInit qrInit) {

        return  ResponseEntity.ok().body(validateimpl.validateQR(qrInit)) ;
    }

}
