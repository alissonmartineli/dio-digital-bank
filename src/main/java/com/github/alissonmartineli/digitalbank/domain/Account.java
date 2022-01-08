package com.github.alissonmartineli.digitalbank.domain;

import com.github.alissonmartineli.digitalbank.domain.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Account {

    private AccountType type;

    private String name;

    private Document document;

    private Email email;

    private Phone phone;

    private Address address;
}
