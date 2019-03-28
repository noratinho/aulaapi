package br.com.viniciuspontes.aulaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaapiApplication{

	//@Autowired
	//private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaapiApplication.class, args);
	}

	/* @Override
	public void run(String... args) throws Exception {
		Produto cat1 = new Produto(null, "Mouse");
		Produto cat2 = new Produto(null, "Teclado");
		
		produtoRepository.saveAll(Arrays.asList(cat1,cat2));
		
}*/

}

