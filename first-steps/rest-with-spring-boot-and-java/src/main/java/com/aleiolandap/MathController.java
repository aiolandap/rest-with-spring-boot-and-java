package com.aleiolandap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.aleiolandap.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {
	validacaoNumerica vn = new validacaoNumerica();
	operacoesMatematicas op = new operacoesMatematicas();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)//método do tipo GET
	public Double sum(//recupera informações pela URL
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		if(!vn.isNumeric(numberOne) || !vn.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Digite um número válido");
		}
		return op.soma(vn.convertToDouble(numberOne), vn.convertToDouble(numberTwo));
	}

	
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)//método do tipo GET
	public Double div(//recupera informações pela URL
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		if(!vn.isNumeric(numberOne) || !vn.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Digite um número válido");
		}
		return op.divisao(vn.convertToDouble(numberOne), vn.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)//método do tipo GET
	public Double sub(//recupera informações pela URL
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		if(!vn.isNumeric(numberOne) || !vn.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Digite um número válido");
		}
		return op.subtracao(vn.convertToDouble(numberOne), vn.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)//método do tipo GET
	public Double mult(//recupera informações pela URL
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		if(!vn.isNumeric(numberOne) || !vn.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Digite um número válido");
		}
		return op.multiplicacao(vn.convertToDouble(numberOne), vn.convertToDouble(numberTwo));
	}
	
	
}
