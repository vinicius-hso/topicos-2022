package br.gov.sp.fatec.projetotopicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projetotopicos.entity.Lance;
import br.gov.sp.fatec.projetotopicos.service.LanceService;

@RestController
@CrossOrigin
@RequestMapping(value = "/lance")
public class LanceController {

    @Autowired
    private LanceService service;

    @GetMapping
    public List<Lance> todos() {
        return service.listarTodos();
    }

    @GetMapping(value = "/{jogador}")
    public List<Lance> bucarPorJogador(@PathVariable("jogador") String jogador) {
        return service.buscarPorJogador(jogador);
    }

    @PostMapping
    public Lance nova(@RequestBody Lance lance) {
        return service.novoLance(lance);
    }
    
}
