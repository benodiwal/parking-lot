package org.example.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel{
    private Long id;
    private String name;
    private Long phNum;

}
