package Clinica.ApiSlotHorario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    @Autowired
    private Repositorio repo;

    public SlotHorario grabar(SlotHorario slo) {
        return repo.save(slo);
    }

    public SlotHorario buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<SlotHorario> listar() {
        return repo.findAll();
    }

    public SlotHorario actualizar(Long id, SlotHorario slo) {
        return repo.findById(id).map(existing -> {
            existing.setIdHor(slo.getIdHor());
            existing.setHorIni(slo.getHorIni());
            existing.setHorFin(slo.getHorFin());
            existing.setEst(slo.getEst());
            return repo.save(existing);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);

    }
}
