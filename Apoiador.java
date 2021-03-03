package atividadefimdemodulo;

public class Apoiador extends Cadastro

	{
		private double Avalia��o;
		private String NomedeUsuario;
		private int IDapoiador;
		
		public Apoiador (String nome, int idade, String email, String telefone, String CPF, double avalia��o, String nomedeusuario, int IDapoiador)
		{
			super (nome, idade, email, telefone, CPF);
			this.Avalia��o = avalia��o;
			this.NomedeUsuario= nomedeusuario;
			this.IDapoiador= IDapoiador;
		}

		public double getAvalia��o() {
			return Avalia��o;
		}

		public void setAvalia��o(double avalia��o) {
			Avalia��o = avalia��o;
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
