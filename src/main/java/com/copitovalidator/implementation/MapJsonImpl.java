package com.copitovalidator.implementation;

;
import com.copitovalidator.model.QRStaticRequest;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class MapJsonImpl {

   // private QRStaticRequest qrStaticRequest ;

    public String MapToDto(Map<String , String> MyMap){


        return  "Mapa recibibo " ;
    }


    public QRStaticRequest ValidateMap(Map<String , String> MyMap) throws IOException {


      JSONObject MapToJson =   new JSONObject(MyMap) ;
      String jsonString = MapToJson.toString() ;
      ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,true);
      QRStaticRequest qrStaticRequest = mapper.readValue(jsonString , QRStaticRequest.class);
      ValidateRequest(qrStaticRequest);

          return qrStaticRequest ;

    }


    public String ValidateRequest(QRStaticRequest qrStaticRequest){


        String OK = "OK";
        System.out.println(qrStaticRequest.getBranch());
        return OK ;


    }

}
