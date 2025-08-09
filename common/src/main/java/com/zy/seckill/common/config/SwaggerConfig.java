package com.zy.seckill.common.config;

import io.prometheus.client.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;

import static org.apache.poi.sl.usermodel.PresetColor.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Seckill API")
                        .version("1.0.0")
                        .description("秒杀系统API文档"));
    }
}