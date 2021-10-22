package com.copitovalidator.implementation;

;
import com.copitovalidator.model.QRStaticRequest;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.DataInput;
import java.io.IOException;
import java.util.Map;

@Service
public class MapJsonImpl {

    public String MapToDto(Map<String , String> MyMap){


        return  "Mapa recibibo " ;
    }


    public String ValidateMap(Map<String , String> MyMap) throws IOException {

      JSONObject MapToJson =   new JSONObject(MyMap) ;
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,true);



        return "OK";



    }

}
