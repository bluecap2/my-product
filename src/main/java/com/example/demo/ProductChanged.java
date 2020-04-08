package com.example.demo;

/*
* EVENT 명칭을 클래스로 만들고 JSON으로 변환되었을 때 event Type으로 골라낼 수 있게 클래스명을 이벤트타입으로 생성
* */
public class ProductChanged {
    String eventType;
    Long productId;
    String productName;
    int productStock;

    public ProductChanged(){
        this.eventType = this.getClass().getSimpleName();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}
