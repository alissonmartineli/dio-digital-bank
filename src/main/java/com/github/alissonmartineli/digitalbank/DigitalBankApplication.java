package com.github.alissonmartineli.digitalbank;

import java.util.Date;
import java.util.logging.Logger;

import com.github.alissonmartineli.digitalbank.domain.AccountPF;
import com.github.alissonmartineli.digitalbank.domain.Address;
import com.github.alissonmartineli.digitalbank.domain.CPF;
import com.github.alissonmartineli.digitalbank.domain.Document;
import com.github.alissonmartineli.digitalbank.domain.Email;
import com.github.alissonmartineli.digitalbank.domain.Phone;
import com.github.alissonmartineli.digitalbank.domain.enums.AccountType;

public class DigitalBankApplication {

	private static final Logger LOGGER = Logger.getLogger("MyLog");

	public static void main(String[] args) {

		Document document = new CPF("12345678901");
		Email email = new Email("test@test.com");
		Phone phone = new Phone("11999999999");
		Address address = new Address("Rua Teste", "123", "Bairro Teste", "São Paulo", "SP", "Brasil", "12345678");

		AccountPF account = new AccountPF();
		account.setType(AccountType.PAYMENT);
		account.setName("Teste");
		account.setDocument(document);
		account.setEmail(email);
		account.setPhone(phone);
		account.setAddress(address);
		account.setBirthDate(new Date());

		LOGGER.info(account.getName());
	}

}
