package br.edu.virtus.gertec.serverWebGertec.controllers;

import br.edu.virtus.gertec.serverWebGertec.utils.SupportFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
public class MainRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainRestController.class);

    @CrossOrigin("*")
    @GetMapping("/fixedword/{numchar}")
    public String fixedWord(@PathVariable("numchar") int numChar) {
        LOGGER.info("Chamada ao metodo fixedWord com {} caracteres", numChar);
        return SupportFunctions.getRandomWordBySize(numChar, true);
    }

    @CrossOrigin("*")
    @GetMapping("/randomword/{numchar}")
    public String randomWord(@PathVariable("numchar") int numChar) {
        LOGGER.info("Chamada ao metodo randomword com {} caracteres", numChar);
        return SupportFunctions.getRandomWordBySize(numChar);
    }

    @CrossOrigin("*")
    @GetMapping("/fixedwordwithdelay/{numchar}/{delay}")
    public String fixedWord(@PathVariable("numchar") int numChar, @PathVariable("delay") int valorDelay) throws InterruptedException {
        LOGGER.info("Chamada ao metodo fixedwordwithdelay com {} caracteres e com delay de {} millisegundos", numChar, valorDelay);
        TimeUnit.MILLISECONDS.sleep(valorDelay);
        return SupportFunctions.getRandomWordBySize(numChar, true);
    }

    @CrossOrigin("*")
    @PostMapping("/postmessage")
    public ResponseEntity<Object> postMessage(@RequestBody String mensagem) {
        LOGGER.info("Chamada ao metodo postmessage com a mensagem: {}", mensagem);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
