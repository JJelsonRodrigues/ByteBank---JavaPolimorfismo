
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Gerente jelson = new Gerente();
		jelson.setNome("Jelson Jr");
		jelson.setCpf("123.456.789.-10");
		jelson.setSalario(2500.00);
		
		System.out.println(jelson.getBonificacao());
		System.out.println(jelson.getNome());
		
	}
}
