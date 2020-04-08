package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {

    @Autowired
    ProductRepository productRepository;


    @StreamListener(Processor.INPUT) //자동으로 yaml에서 input의 topic이 뭔지 확인해서 설정함
    public void onEventByString(@Payload OrderPlaced orderPlaced){

        //원하는 이벤트만 걸러서 처리하기 위함.
        if("OrderPlaced".equals(orderPlaced.getEventType())){
            System.out.println("======================= Listner ======================");
            //System.out.println(orderPlaced);
            System.out.println("order placed -> product change");

            Product p = new Product();
            p.setId(orderPlaced.getProductId());
            p.setName(orderPlaced.getProductName());
            p.setStock(orderPlaced.getQty());
            productRepository.save(p);

            System.out.println("======================================================");

        }


    }

}
