package com.example.system.entity.dto;

import com.example.system.entity.PageParam;
import lombok.Data;

/**
 * @author xk
 * @date 2019-10-11 22:51
 */
@Data
public class UserDTO extends PageParam {

    private String account;
}
