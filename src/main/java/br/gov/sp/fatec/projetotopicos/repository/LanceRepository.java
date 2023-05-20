package br.gov.sp.fatec.projetotopicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetotopicos.entity.Lance;

public interface LanceRepository extends JpaRepository<Lance, Long>{

    public List<Lance> findByJogadorContains(String jogador);
    
}
