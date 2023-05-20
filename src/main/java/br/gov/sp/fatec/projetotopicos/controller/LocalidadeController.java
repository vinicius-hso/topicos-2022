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

import br.gov.sp.fatec.projetotopicos.entity.Localidade;
import br.gov.sp.fatec.projetotopicos.service.LocalidadeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/localidade")
public class LocalidadeController {

    @Autowired
    private LocalidadeService service;

    @GetMapping
    public List<Localidade> todas() {
        return service.listarTodas();
    }

    @GetMapping(value = "/{descricao}")
    public List<Localidade> buscarPorDescricao(@PathVariable("descricao") String descricao) {
        return service.buscarPorDescricao(descricao);
    }

    @PostMapping
    public Localidade nova(@RequestBody Localidade localidade) {
        return service.novaLocalidade(localidade);
    }
    
}
