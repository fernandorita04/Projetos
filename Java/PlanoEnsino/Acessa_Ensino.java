package PlanoEnsino;
 
import javax.swing.JOptionPane;
 
public class Acessa_Ensino {
 
	public static void main(String[] args) {
 
		Plano_Ensino a = new Plano_Ensino();
		
		String mt, cp, ca, bb;
		
		mt = JOptionPane.showInputDialog("Digite a materia: ");
		cp = JOptionPane.showInputDialog("Digite o conteudo Programatico: ");
		ca = JOptionPane.showInputDialog("Digite o criterio de Avaliacao: ");
		bb = JOptionPane.showInputDialog("Digite a bibliografia: ");
		
		a.setMateria(mt);
		a.setConteudoProgramatico(cp);
		a.setCriterioAvaliacao(ca);
		a.setBibliografia(bb);
		
		System.out.println("Materia: " + a.getMateria());
		System.out.println("Conteudo Programatico: " + a.getConteudoProgramatico());
		System.out.println("Criterio de avaliacao: " + a.getCriterioAvaliacao());
		System.out.println("Bibliografia: " + a.getBibliografia());
		
		Plano_Ensino b = new Plano_Ensino("POO", "Java", "Trabalho", "Mauricio");
		b.mostraDados();
		
	}

}