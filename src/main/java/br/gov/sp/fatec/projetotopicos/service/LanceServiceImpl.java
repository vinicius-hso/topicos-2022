package br.gov.sp.fatec.projetotopicos.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetotopicos.entity.Lance;
import br.gov.sp.fatec.projetotopicos.repository.LanceRepository;

@Service
public class LanceServiceImpl implements LanceService{

    @Autowired
    private LanceRepository repo;

    @Override
    @PreAuthorize("isAuthenticated()")
    public Lance novoLance(Lance lance) {
        lance.setDataHora(new Date());
        return repo.save(lance);
    }

    @Override
    public List<Lance> listarTodos() {
        return repo.findAll();
    }

    @Override
    public List<Lance> buscarPorJogador(String jogador) {
        return repo.findByJogadorContains(jogador);
    }
    
}
