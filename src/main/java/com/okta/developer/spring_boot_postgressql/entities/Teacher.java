package com.okta.developer.spring_boot_postgressql.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends EntityWithUUID {
    private String name;
    private String pictureURL;
    private String email;
}
