package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetotopicos.entity.Localidade;
import br.gov.sp.fatec.projetotopicos.repository.LocalidadeRepository;

@Service
public class LocalidadeServiceImpl implements LocalidadeService{

    @Autowired
    private LocalidadeRepository repo;
    
    @Override
    @PreAuthorize("isAuthenticated()")
    public Localidade novaLocalidade(Localidade localidade) {
        return repo.save(localidade);
    }

    @Override
    public List<Localidade> listarTodas() {
        return repo.findAll();
    }

    @Override
    public List<Localidade> buscarPorDescricao(String descricao) {
        return repo.findByDescricaoContains(descricao);
    }
}