package atividadefimdemodulo;

public class Cadastro {

	
		private String nomeCompleto;
		private int Idade;
		private String Email;
		private String Telefone;
		private String CPF;
		
		public Cadastro (String nome, int idade, String email, String telefone, String cpf)
		{
			this.nomeCompleto=nome;
			this.Idade=idade;
			this.Email= email; 
			this.Telefone= telefone;
			this.CPF=cpf;
		}

		public String getNomeCompleto() {
			return nomeCompleto;
		}

		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}

		public int getIdade() {
			return Idade;
		}

		public void setIdade(int idade) {
			Idade = idade;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getTelefone() {
			return Telefone;
		}

		public void setTelefone(String telefone) {
			Telefone = telefone;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cpf) {
			CPF = cpf;
		}
		

}
