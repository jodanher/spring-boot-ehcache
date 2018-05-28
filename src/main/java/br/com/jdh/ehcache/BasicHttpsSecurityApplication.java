package br.com.jdh.ehcache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BasicHttpsSecurityApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(BasicHttpsSecurityApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BasicHttpsSecurityApplication.class, args);
    }

    @Override
    public void run(String[] args) {
    }
}
