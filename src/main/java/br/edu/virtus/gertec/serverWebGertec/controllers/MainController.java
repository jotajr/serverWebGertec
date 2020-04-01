package br.edu.virtus.gertec.serverWebGertec.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView("mainpage");
        Date data = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        modelAndView.addObject("horaAtual", simpleDateFormat.format(data));
        return modelAndView;
    }

}
