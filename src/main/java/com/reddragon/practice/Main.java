package com.reddragon.practice;

/**
 * @author ScorchingShade
 * Class main for practice on spring boot Application
 */

import com.reddragon.practice.beans.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan
public class Main {

    static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(Main.class, args);
        Employee e = ctx.getBean(Employee.class);
        System.out.println(e.toString());

    }


}
