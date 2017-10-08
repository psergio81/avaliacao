package br.com.stdio.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stdio.avaliacao.model.Cargo;
import br.com.stdio.avaliacao.repository.Cargos;

@Service
public class CargoService {

	@Autowired
	Cargos cargos;
	
	public List<Cargo> getTodosCargos() {
		return cargos.findAll();
	}

	public void salvar(Cargo cargo) {
		cargos.save(cargo);
	}

	public Cargo getCargo(Long codigo) {
		return cargos.getOne(codigo);
	}

	public void excluir(Long codigo) {
		cargos.delete(codigo);
	}

}
