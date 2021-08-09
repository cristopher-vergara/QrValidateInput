package com.copitovalidator.implementation;
import com.copitovalidator.model.QrInit;
import com.copitovalidator.model.QrOut;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ValidateImpl {

    public ResponseEntity validateQR(QrInit qrInit) {

        QrOut qrout = new QrOut();

        //nombre
        try {
            qrout.setNameOut(qrInit.getName());
        } catch (StringIndexOutOfBoundsException ex) {
            return new ResponseEntity("Verifique el largo del nombre", HttpStatus.CONFLICT);
        }

        //apellido
        try {
            qrout.setLastnameOut(qrInit.getLastname());

        } catch (StringIndexOutOfBoundsException ex) {
            return new ResponseEntity("Verifique el largo del apellido ", HttpStatus.CONFLICT);
        }

        //fecha
        try{
            qrout.setDateOut(qrInit.getDate()) ;
        }catch (StringIndexOutOfBoundsException ex){
            return new ResponseEntity("Verifique el largo de la fecha" , HttpStatus.CONFLICT) ;
        }


        //telefono
        try {
            String phoneString = Integer.toString(qrInit.getPhone());
            if (phoneString.length() == 5) {
                System.out.println("Fono ok ") ;
            } else {
                throw new StringIndexOutOfBoundsException(qrInit.getPhone()+" Largo del fono = 5");
            }

        } catch (StringIndexOutOfBoundsException ex) {
           return  new ResponseEntity("Error en el largo del fono ", HttpStatus.CONFLICT );
        }

        HttpHeaders header = new HttpHeaders() ;
        header.add("Valido" , "Ok");

        return new ResponseEntity(qrInit.toString(), header,HttpStatus.OK) ;

    }
}
