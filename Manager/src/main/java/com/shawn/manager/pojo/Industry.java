package com.shawn.manager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : shawn
 * @date : 2022-07-04 19:09
 * @description :
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Industry {
    private String industryName;
    private String industryYear;
    private int industryDefault;
    private int industryRebirth;

}
