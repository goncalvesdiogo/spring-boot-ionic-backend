package com.goncalvesdiogo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goncalvesdiogo.cursomc.domain.Pedido;
import com.goncalvesdiogo.cursomc.repositories.PedidoRepository;
import com.goncalvesdiogo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrando! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
