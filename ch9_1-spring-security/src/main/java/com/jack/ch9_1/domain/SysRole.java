package com.jack.ch9_1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * @author yangyueming
 */
@Entity
@Data
public class SysRole {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
