package com.wisely.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangyueming
 */
@Entity //1
@NamedQuery(name = "Person.withNameAndAddressNamedQuery",
    query = "select p from Person p where p.name=?1 and address=?2")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id //2
    @GeneratedValue //3
    private Long id;

    private String name;

    private Integer age;

    private String address;
    
}
