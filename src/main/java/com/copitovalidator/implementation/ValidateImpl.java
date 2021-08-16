package com.copitovalidator.implementation;
import com.copitovalidator.model.QrInit;
import com.copitovalidator.model.QrOut;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.zip.CRC32;
import java.util.zip.Checksum;

@Service
public class ValidateImpl {

    public ResponseEntity validateQR(QrInit qrInit) {

        QrOut qrout = new QrOut();
        String checksum= null  ;
        //nombre
        try {
            qrout.setNameOut(qrInit.getName());
            checksum += qrInit.getName().toString() ;

        } catch (StringIndexOutOfBoundsException ex) {
            return new ResponseEntity("Verifique el largo del nombre", HttpStatus.CONFLICT);
        }

        //apellido
        try {
            qrout.setLastnameOut(qrInit.getLastname());
            checksum += qrInit.getLastname().toString() ;

        } catch (StringIndexOutOfBoundsException ex) {
            return new ResponseEntity("Verifique el largo del apellido ", HttpStatus.CONFLICT);
        }

        //fecha
        try{
            qrout.setDateOut(qrInit.getDate()) ;
            checksum += qrInit.getDate() ;
        }catch (StringIndexOutOfBoundsException ex){
            return new ResponseEntity("Verifique el largo de la fecha" , HttpStatus.CONFLICT) ;
        }


        //telefono
        try {
            String phoneString = Integer.toString(qrInit.getPhone());
            if (phoneString.length() == 5) {
                System.out.println("Fono ok ") ;
                checksum +=  phoneString ;
            } else {
                throw new StringIndexOutOfBoundsException(qrInit.getPhone()+" Largo del fono = 5");
            }

        } catch (StringIndexOutOfBoundsException ex) {
           return  new ResponseEntity("Error en el largo del fono ", HttpStatus.CONFLICT );
        }

       /* checksum 32 bits
        byte[] bytes = checksum.getBytes();
        CalculateChecksum chk = new CalculateChecksum() ;

        Long ckecksumFinal = chk.CalculateChecksum(bytes) ;
        String chkString = String.valueOf(ckecksumFinal) ;
        */

        //checksum 16 bits

       CalculateChecksum16 chk16 = new CalculateChecksum16() ;
        String chkString = chk16.generateChecksum(checksum) ;


        HttpHeaders header = new HttpHeaders() ;
        header.add("OK" , "Valido");

        return new ResponseEntity(chkString, header,HttpStatus.OK) ;




    }


}
