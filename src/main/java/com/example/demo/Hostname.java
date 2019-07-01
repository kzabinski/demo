package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class Hostname {
    InetAddress ip = InetAddress.getLocalHost();;

    public Hostname() throws UnknownHostException {
    }

    @GetMapping(value = "/hostname")
    public String getHostname() {
        return ip.getHostName();
    }
}
