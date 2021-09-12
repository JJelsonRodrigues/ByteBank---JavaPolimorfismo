//EditorVideo é um funcionario e herda da classe Funcionario
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando a bonificacao do Editor de Video");
		return 150;
	}
	
}