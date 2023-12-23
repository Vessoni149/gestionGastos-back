
package com.gestiongastos.back.repository;

import com.gestiongastos.back.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGastoRepository extends JpaRepository<Gasto,Long> {
    
}
