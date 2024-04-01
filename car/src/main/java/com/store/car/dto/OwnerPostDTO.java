package com.store.car.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude
public class OwnerPostDTO {
    private String name;
    private String type;
    private String contactNumber;
}
