package com.zhaluo.box.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;



@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
@Data
public class Student  implements Serializable {

    private Long sid;

    private String sname;

    private String sex;

    private String address;

}
