package com.goncalvesdiogo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goncalvesdiogo.cursomc.domain.Cliente;
import com.goncalvesdiogo.cursomc.repositories.ClienteRepository;
import com.goncalvesdiogo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrando! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
