package com.ceiba.revision.controlador;

import com.ceiba.revision.consulta.ManejadorListarRevisiones;
import com.ceiba.revision.modelo.dto.DtoRevision;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/revisiones")
public class ConsultaControladorRevision {
    private final ManejadorListarRevisiones manejadorListarRevisiones;

    public ConsultaControladorRevision(ManejadorListarRevisiones manejadorListarRevisiones){
        this.manejadorListarRevisiones = manejadorListarRevisiones;
    }

    @GetMapping
    public List<DtoRevision> listar(){
        return this.manejadorListarRevisiones.listar();
    }

    @GetMapping(value="/buscar/{idRevision}")
    public DtoRevision buscarxIdRevision(@PathVariable Long idRevision){
        return this.manejadorListarRevisiones.buscarxIdRevision(idRevision);
    }

}
