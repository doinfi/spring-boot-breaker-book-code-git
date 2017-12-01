package com.jack.ch9_1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yangyueming
 */
@Data
@AllArgsConstructor
public class Msg {

    private String title;
    private String content;
    private String etraInfo;
}
