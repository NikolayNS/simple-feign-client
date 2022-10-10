package com.dmitrenko.simplefeignclient.model.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
public class SomeRequest {

    private UUID id;
    private String type;
}
