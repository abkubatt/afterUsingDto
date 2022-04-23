package kg.megacom.test_app.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_lang")
public class Language {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean isActive;


}
