package com.wsw.management.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


@Configuration
public class MessageSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporte(){
        return new ServerEndpointExporter();
    }
}
