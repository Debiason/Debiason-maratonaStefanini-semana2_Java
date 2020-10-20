package br.com.maratona.dev.resource.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.maratona.dev.resource.InscricaoHelper;
import br.com.maratona.dev.resource.Pessoa;

public class InscricaoHelperTest {
	
	InscricaoHelper inscricaoHelper = new InscricaoHelper();
	
	public static final long LIMIT= 20000;

	
	@Before
	public void configTest() {
		System.out.println("Teste Iniciado!");
	}
	
	@After
	public void finishTest() {
		System.out.println("Teste Finalizado!");
	}
	
	@BeforeClass
	public static void config() {
		System.out.println("Classe de Teste Iniciado!");
	}
	
	@AfterClass
	public static void finish() {
		System.out.println("Classe de Teste Finalizado!");
	}
	
	@Test(timeout = LIMIT)
	public void findPessoa() {
		Pessoa retornoFind = inscricaoHelper.findPessoa(1);
		assertEquals(new Integer(1), retornoFind.getMatricula());
	}
	
	@Test
	public void findPessoa1() {
		Pessoa retornoFind = inscricaoHelper.findPessoa(11);
		assertEquals(null, retornoFind);
	}

}
