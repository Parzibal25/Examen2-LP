package com.examen2.examen2.controladores;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reserve")
public class ReserveController {

    @PostMapping("/calculo")
    public String reserve() {
        return "Hola mundo";
    }

}
