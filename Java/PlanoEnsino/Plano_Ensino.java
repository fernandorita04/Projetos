package PlanoEnsino;
 
public class Plano_Ensino {
	
	private String materia;
	private String conteudoProgramatico;
	private String criterioAvaliacao;
	private String bibliografia;
	
	Plano_Ensino(){
		
	}
	
	Plano_Ensino(String materia, String conteudoProgramatico, String criterioAvaliacao, String bibliografia){
		this.materia = materia;
		this.conteudoProgramatico = conteudoProgramatico;
		this.criterioAvaliacao = criterioAvaliacao;
		this.bibliografia = bibliografia;
	}
 
	public void setMateria(String materia) {
		this.materia = materia;
	}
 
	public void setConteudoProgramatico(String conteudoProgramatico) {
		this.conteudoProgramatico = conteudoProgramatico;
	}
 
	public void setCriterioAvaliacao(String criterioAvaliacao) {
		this.criterioAvaliacao = criterioAvaliacao;
	}
 
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public String getMateria() {
		return materia;
	}
 
	public String getConteudoProgramatico() {
		return conteudoProgramatico;
	}
 
	public String getCriterioAvaliacao() {
		return criterioAvaliacao;
	}
 
	public String getBibliografia() {
		return bibliografia;
	}
 
	String dados;
	
	public void mostraDados() {
		System.out.println("Materia:\t" +
		materia + "\n" +
		"Conteudo Programatico:\t" +
		conteudoProgramatico + "\n" +
		"Criterio de avaliacao:\t" +
		criterioAvaliacao + "\n" +
		"Bibliografia:\t" +
		bibliografia + "\n");
	}
}