package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;

import br.gov.sp.fatec.projetotopicos.entity.Localidade;

public interface LocalidadeService {

    public Localidade novaLocalidade(Localidade localidade);

    public List<Localidade> listarTodas();

    public List<Localidade> buscarPorDescricao(String descricao);
    
}
