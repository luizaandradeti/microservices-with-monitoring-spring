package com.manager.itens.controller;


import com.manager.itens.ChamadosApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class Health {


    @GetMapping("/health")
       public String startActuator() {
        Logger logger = LoggerFactory.getLogger(Health.class);
        logger.info("Health");
        logger.info("Health");
        logger.info("Health");
        logger.info("Health");
        logger.info("Health");
        logger.info("Health");
        logger.info("Health");
        logger.info("Health");
        logger.info("Health");
        return "Actuator";
    }


}