package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createDate;
    private Date updateDate;
}
