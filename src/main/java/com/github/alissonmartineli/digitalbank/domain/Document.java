package com.github.alissonmartineli.digitalbank.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Document {

    private String number;
}
