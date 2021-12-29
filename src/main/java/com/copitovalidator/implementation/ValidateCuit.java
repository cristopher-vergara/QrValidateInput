package com.copitovalidator.implementation;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
/** separar el cuit en cifras
*          lista de multiplicadores
*          acumulador de la suma
*         se necesita modulo de la division
 *       se necesita el resultado de la resta
*       extraer el digito del cuit interno
*     obtener el digito calculado */

public class ValidateCuit {

    public boolean validatecuit (String input_cuit){

        String cuit = input_cuit.replace("-","");
        boolean isvalid = false ;

        String digito = cuit.substring(cuit.length()-1);
        String digito_calculado = "";
        Float acumula = new Float(0);
        Float modulo = new Float(0);
        Float resta = new Float(0 );
        Float divisor = new Float(11);
        Float fonce = new Float(11);
        Float fdiez = new Float(10);

        if (cuit.length() < 11){
            isvalid = false ;
        }

        /** Lista de multiplidadores*/

       List<Integer> multipli = new ArrayList<Integer>();
        multipli.add(0 , new Integer(5));
        multipli.add(1 , new Integer(4));
        multipli.add(2 , new Integer(3));
        multipli.add(3 , new Integer(2));
        multipli.add(4 , new Integer(7));
        multipli.add(5 , new Integer(6));
        multipli.add(6 , new Integer(5));
        multipli.add(7 , new Integer(4));
        multipli.add(8 , new Integer(3));
        multipli.add(9 , new Integer(2));

        /**Dividir cuit en digitos*/

        for(int x= 0 ; x< cuit.length()-1 ; x ++){

            String undigito = cuit.substring(x,x+1);
            Float multi = new Float(multipli.get(x));
            Float cuenta1 = new Float(undigito) * multi ;

            acumula = acumula +cuenta1 ;

        }
        modulo = acumula % divisor ;

        //si resta da 11 digito verificador es 0
        //si resta da 10 digito verificador es 9

        resta = divisor -modulo ;

        if (resta.compareTo(fonce)==0){

              digito_calculado = "0" ;

        }else if(resta.compareTo(fdiez)==0){

            digito_calculado = "9" ;
        }else {

            digito_calculado = new Integer(resta.intValue()).toString();
        }

        System.out.println(digito_calculado);

        if(digito.compareTo(digito_calculado)==0){

            isvalid = true ;
        }else {

            isvalid = false ;
        }

        return isvalid ;
    }
}
