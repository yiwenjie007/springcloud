package com.master.serviceb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class House implements Serializable{

    /** 主键 */
    private Long id;

    /**  */
    private String title;

    /**  */
    private String price;

    /**  */
    private String aroundPrice;

    /**  */
    private String houseType;

    /**  */
    private String address;

    /**  */
    private String phone;

    /**  */
    private String opentime;

    /**  */
    private String completetime;

    /**  */
    private String url;

}
