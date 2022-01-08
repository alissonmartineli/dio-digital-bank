package com.github.alissonmartineli.digitalbank.domain;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AccountPF extends Account {

    private Date birthDate;

}
