package gen_oop;

public class Apoiador extends Cadastro{
	private double avaliacao;
	private String nomedeUsuario;
	private int idApoiador; 
	
	public Apoiador (String nome, int idade, String email, String telefone, String cpf, double avaliacao, String nomedeusuario, int idApoiador)
	{
		super(nome, idade, email, telefone, cpf);
		this.avaliacao = avaliacao;
		this.nomedeUsuario= nomedeusuario;
		this.idApoiador= idApoiador;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getNomedeUsuario() {
		return nomedeUsuario;
	}

	public void setNomedeUsuario(String nomedeUsuario) {
		nomedeUsuario = nomedeUsuario;
	}

	public int getIDapoiador() {
		return idApoiador;
	}

	public void setIDapoiador(int idApoiador) {
		idApoiador = idApoiador;
}
}
