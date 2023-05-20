package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;

import br.gov.sp.fatec.projetotopicos.entity.Lance;

public interface LanceService {

    public Lance novoLance(Lance lance);

    public List<Lance> buscarPorJogador(String jogador);

    public List<Lance> listarTodos();
    
}