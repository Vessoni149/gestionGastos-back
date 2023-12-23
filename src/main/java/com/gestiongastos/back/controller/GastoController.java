
package com.gestiongastos.back.controller;

import com.gestiongastos.back.model.Gasto;
import com.gestiongastos.back.service.IGastoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GastoController {
    @Autowired
    IGastoService gastoServ;
    
    @GetMapping("/gastos/traer")
    public List<Gasto> getGastos(){
        return gastoServ.getGastos();
    }
    
    @PostMapping("/gastos/crear")
    public Gasto saveGasto(@RequestBody Gasto gasto){
        gastoServ.saveGasto(gasto);
        return gasto;
    }
    
    @DeleteMapping("/gastos/borrar/{id}")
    public void deleteGasto(@PathVariable Long id){
        gastoServ.deleteGasto(id);
    }
            
    @PutMapping("/gastos/editar")
    public void editGasto(@RequestBody Gasto gasto){
        gastoServ.editGasto(gasto);
    }
    
    
    
}
