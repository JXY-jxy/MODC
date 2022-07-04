package com.shawn.manager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : shawn
 * @date : 2022-07-04 19:12
 * @description :
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    private String regionName;
    private String regionYear;
    private int regionDefault;
    private int regionRebirth;

}
