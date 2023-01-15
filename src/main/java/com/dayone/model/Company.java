package com.dayone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    // Entity 가 있음에도 model class 별도 정의 이유
    // Entity class 는 database table 과 직접 매핑 목적
    // 데이터를 주고받거나 변경하는 등 로직이 적용되면 본래 역할을 벗어나게 될 수 있음
    // 하나의 클래스에 여러 기능을 적용하면 사이드 이펙트가 발생할 가능성 또한 증가함

    private String ticker;
    private String name;
}
