package com.dmitrenko.simplefeignclient.integration.http.client;

import com.dmitrenko.simplefeignclient.model.dto.request.SomeRequest;
import com.dmitrenko.simplefeignclient.model.dto.response.SomeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(name = "firstSimpleFeignClient", url = "${integration.first-address.base-url}")
public interface FirstSimpleFeignClient {

    @GetMapping(value = "${integration.first-address.first-endpoint}", produces = APPLICATION_JSON_VALUE)
    SomeResponse startProcess();

    @GetMapping(value = "${integration.first-address.second-endpoint}", produces = APPLICATION_JSON_VALUE)
    SomeResponse getById(UUID id);

    @PostMapping(value = "${integration.first-address.third-endpoint}", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    SomeResponse postByRequest(SomeRequest request);
}
