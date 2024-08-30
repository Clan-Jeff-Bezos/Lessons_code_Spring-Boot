package com.riwi.RiwiMovies.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "Riwi Movies",
        version = "1.0",
        description = "API to manage MovieRIWI"
))
public class OpenApiConfiguration {
}
