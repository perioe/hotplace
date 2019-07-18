package com.hotplace.hotplace.config;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("datasource")
public class DatabaseProperty {
    private String url;
    private List<Slave> slaveList;

    private String username;
    private String password;

    @Getter
    @Setter
    public static class Slave {
        private String name;
        private String url;
    }
}
