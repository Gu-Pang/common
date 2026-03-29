package org.gupang;

import org.gupang.config.FeignClientConfig;
import org.gupang.config.JpaConfig;
import org.gupang.config.RedisConfig;
import org.gupang.exception.GlobalExceptionHandler;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class AppCtx {

    @Bean
    @ConditionalOnMissingBean(FeignClientConfig.class)
    public FeignClientConfig feignClientConfig() {
        return new FeignClientConfig();
    }

    @Bean
    @ConditionalOnMissingBean(JpaConfig.class)
    public JpaConfig jpaConfig() {
        return new JpaConfig();
    }


    @Bean
    @ConditionalOnMissingBean(RedisConfig.class)
    public RedisConfig redisConfig() {
        return new  RedisConfig();
    }

    @Bean
    @ConditionalOnMissingBean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

}
