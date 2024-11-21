package pe.edu.i201221362.cl1_jpa_data_amaro_willy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class country {
    @Id
    @Column(name = "Code")
    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Float lifeExpectancy;
    private Float gnp;
    private Float gnpOld;
    private String localName;
    private String GovernmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<city> cities = new ArrayList<>();

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<countryLanguage> languages;



}