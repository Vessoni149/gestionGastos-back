
package com.gestiongastos.back.service;

import com.gestiongastos.back.model.Gasto;
import java.util.List;


public interface IGastoService {
    public List<Gasto> getGastos();
    public Gasto findGasto(Long id);
    public void saveGasto(Gasto gasto);
    public void deleteGasto(Long id);
    public void editGasto(Gasto gasto);
    
}
