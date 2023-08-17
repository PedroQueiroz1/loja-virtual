package br.com.lojavirtual.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", initialValue = 1, allocationSize = 1)
public class Acesso implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
    private Integer id;
    @Column(nullable = false)
    private String descricao; // Acesso ex: ROLE_ADMIN ou ROLE_SECRETARIO

    @Override
    public String getAuthority() {
        return this.descricao;
    }
}
