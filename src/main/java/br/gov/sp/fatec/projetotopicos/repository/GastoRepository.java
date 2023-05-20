package br.gov.sp.fatec.projetotopicos.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetotopicos.entity.Gasto;

public interface GastoRepository extends JpaRepository<Gasto, Long>{

    public List<Gasto> findByValorGreaterThan(BigDecimal valor);
    
}