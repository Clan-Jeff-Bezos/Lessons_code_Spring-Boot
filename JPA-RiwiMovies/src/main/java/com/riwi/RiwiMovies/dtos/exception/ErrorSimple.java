package com.riwi.RiwiMovies.dtos.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
public class ErrorSimple {
    private Integer code;
    private String status;
}
