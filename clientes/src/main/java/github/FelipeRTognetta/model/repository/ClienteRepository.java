package github.FelipeRTognetta.model.repository;

import github.FelipeRTognetta.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
