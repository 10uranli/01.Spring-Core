package com.spring.springcore._06.dependencyInjection;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {

    private String customerName;
    private Address address; //cons.
    private Occupation occupation; //getter, setter


    /* //adres objesine sınıfını bağımlı yaptın.
    public Customer(){
        address = new Address();
    }
    */

    // artık adres objesi dışarıdan bekleniyor
    public Customer(Address address){
        this.address = address;
    }

    public void callAllInfo(){
        System.out.println("Musteri : " + customerName + " " + "Sehir : " + address.getCity() + " " + "İs Tipi : " +  occupation.getType());
    }
}
