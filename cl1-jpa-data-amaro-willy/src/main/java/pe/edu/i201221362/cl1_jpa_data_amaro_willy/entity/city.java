package pe.edu.i201221362.cl1_jpa_data_amaro_willy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "city")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country country;
    private String name;
    private String district;
    private Integer population;




}
