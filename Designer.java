//Designer é um funcionario e herda da classe Funcionario
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando a bonificacao do Designer");
		return 200;
	}
	
}