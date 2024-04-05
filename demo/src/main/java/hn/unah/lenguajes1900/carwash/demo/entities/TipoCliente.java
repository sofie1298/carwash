package hn.unah.lenguajes1900.carwash.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tipocliente")
@Data
public class TipoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipocliente")
    private Long idTipoCliente;
    private String descripcion;
    @OneToMany(mappedBy = "tipoCliente")
    @JsonIgnore
    private List<Cliente> cliente;
}
