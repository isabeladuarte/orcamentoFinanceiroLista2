package orcamentopessoal;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Orcamento {

	public static void main(String[] args) {
		Data data = new Data(1, MesesDoAno.JANEIRO, 2021);
		
		LocalTime hora = LocalTime.of(12, 00, 00, 100000);
		System.out.println("Horário do vencimento: " + hora);
		
		BigDecimal valorFatura = new BigDecimal("200.0");
		BigDecimal juros = new BigDecimal("0.5");
		BigDecimal valorFinal = valorFatura.divide(juros);
	
		System.out.println("Valor da fatura: " + valorFinal);
	}

}
