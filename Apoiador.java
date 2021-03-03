package atividadefimdemodulo;

public class Apoiador extends Cadastro

	{
		private double Avaliação;
		private String NomedeUsuario;
		private int IDapoiador;
		
		public Apoiador (String nome, int idade, String email, String telefone, String CPF, double avaliação, String nomedeusuario, int IDapoiador)
		{
			super (nome, idade, email, telefone, CPF);
			this.Avaliação = avaliação;
			this.NomedeUsuario= nomedeusuario;
			this.IDapoiador= IDapoiador;
		}

		public double getAvaliação() {
			return Avaliação;
		}

		public void setAvaliação(double avaliação) {
			Avaliação = avaliação;
		}

		public String getNomedeUsuario() {
			return NomedeUsuario;
		}

		public void setNomedeUsuario(String nomedeUsuario) {
			NomedeUsuario = nomedeUsuario;
		}

		public int getIDapoiador() {
			return IDapoiador;
		}

		public void setIDapoiador(int iDapoiador) {
			IDapoiador = iDapoiador;
		}
		
		
		
	}
