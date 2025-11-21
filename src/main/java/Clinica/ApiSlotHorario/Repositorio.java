package Clinica.ApiSlotHorario;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<SlotHorario, Long> {

    List<SlotHorario> findByIdHor(Long idHor);
}
