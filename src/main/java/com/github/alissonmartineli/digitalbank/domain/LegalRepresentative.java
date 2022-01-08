package com.github.alissonmartineli.digitalbank.domain;

import java.util.Date;

import com.github.alissonmartineli.digitalbank.domain.enums.LegalRepresentativeType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LegalRepresentative {

    private String name;

    private CPF cpf;

    private Date birthDate;

    private String motherName;

    private LegalRepresentativeType type;
}
