package com.github.alissonmartineli.digitalbank.domain;

import java.util.Date;

import com.github.alissonmartineli.digitalbank.domain.enums.CompanyType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AccountPJ extends Account {

    private CompanyType companyType;

    private LegalRepresentative legalRepresentative;

    private Cnae cnae;

    private Date establishmentDate;

}
