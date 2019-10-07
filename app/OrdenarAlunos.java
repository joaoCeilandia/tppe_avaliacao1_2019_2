package app;

public class OrdenarAlunos {
	
	private final CadastroAlunos cadastro;
	private Aluno resposta[];
	private int i;
	private int j;
	private String matricula1;
	private String matricula2;
	private Aluno t;
	
	public OrdenarAlunos(CadastroAlunos cadastro) {
		this.cadastro = cadastro;
	}
	
	public Aluno[] computar() {
		resposta = new Aluno[cadastro.alunos.length];
		for (int i=0; i < cadastro.alunos.length; i++) {
			resposta[i] = cadastro.alunos[i]; 
		}
		
		for (i = 0; i < resposta.length - 1; i++) {
			for (j = i; j < resposta.length; j++) {
				matricula1 = this.formataMatricula(resposta, i);
				matricula2 = this.formataMatricula(resposta, j);
				if (matricula1.compareTo(matricula2) > 0) {
					t = resposta[i]; 
					resposta[i] = resposta[j];
					resposta[j] = t;
				}
			}
		}
		
		return resposta;
	}
	
	private String formataMatricula(Aluno[] resposta, int i) {
		return resposta[i].getPrefixoMatricula() + "/" + resposta[i].getSufixoMatricula();
	}
}
