
package com.gestiongastos.back.service;

import com.gestiongastos.back.model.Gasto;
import com.gestiongastos.back.repository.IGastoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService implements IGastoService{
    @Autowired
    private IGastoRepository gastoRepo;

    @Override
    public List<Gasto> getGastos() {
        List<Gasto> gastos = gastoRepo.findAll();
        return gastos;
    }

    @Override
    public Gasto findGasto(Long id) {
        Gasto gasto = gastoRepo.findById(id).orElse(null);
        return gasto;
    }

    @Override
    public void saveGasto(Gasto gasto) {
        gastoRepo.save(gasto);
    }

    @Override
    public void deleteGasto(Long id) {
       gastoRepo.deleteById(id);
    }

    @Override
    public void editGasto(Gasto gasto) {
        gastoRepo.save(gasto);
    }
}
