package pe.edu.i201221362.cl1_jpa_data_amaro_willy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "countrylanguage")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class countryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country country;
    private Boolean isOfficial;
    private String language;
    private Float percentage;

    ///git 


}
