package br.gov.sp.fatec.projetotopicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetotopicos.entity.Localidade;

public interface LocalidadeRepository extends JpaRepository<Localidade, Long>{

    public List<Localidade> findByDescricaoContains(String descricao);
    
}
