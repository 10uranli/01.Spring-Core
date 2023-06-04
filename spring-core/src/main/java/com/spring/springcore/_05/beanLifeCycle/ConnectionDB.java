package com.spring.springcore._05.beanLifeCycle;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConnectionDB {
    //Builder ekleyince default cons. hatası
    private String URL;
    private String userName;

    public void init(){
        System.out.println("init..");
    }
    public void destroy() {
        System.out.println("destroy..");
    }
}
