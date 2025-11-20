
package Clinica.ApiSlotHorario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slotHorario")
public class Control {

    @Autowired
    private Servicio serv;

    @PostMapping("/grabar")
    public SlotHorario grabar(@RequestBody SlotHorario slo) {
        return serv.grabar(slo);
    }

    @GetMapping("/buscar/{id}")
    public SlotHorario buscar(@PathVariable Long id) {
        return serv.buscar(id);
    }

    @GetMapping("/listar")
    public List<SlotHorario> listar() {
        return serv.listar();
    }

    @PutMapping("/actualizar/{id}")
    public SlotHorario actualizar(@PathVariable Long id, @RequestBody SlotHorario slo) {
        return serv.actualizar(id, slo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serv.eliminar(id);
    }
}
