package com.dmitrenko.simplefeignclient.model.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SomeResponse {

    private String name;
    private String description;
}
