package com.okta.developer.spring_boot_postgressql.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends EntityWithUUID {

    private String name;
    private int workload;
    private short rate;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_course_teacher"))
    private Teacher teacher;
}
