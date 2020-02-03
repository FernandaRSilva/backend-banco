package br.com.fernandareis.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fernandareis.bank.entity.Conta;
import br.com.fernandareis.bank.entity.ContaPK;

@Repository
public interface ContaRepository extends JpaRepository<Conta, ContaPK>{

}
