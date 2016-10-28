package br.com.grocha.servicos.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface GitSoap {

	@WebMethod
	public String testeSoap(@WebParam(name="nome") String nome) throws Exception;
}
