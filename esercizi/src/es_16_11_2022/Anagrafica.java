package es_16_11_2022;

public class Anagrafica {
	public String Nome, Cognome;
	private String Email;
	private boolean Registrata;
	public String risposta;

		public Anagrafica (String Nome, String Cognome, String Email, String risposta) {
			this.Nome=Nome;
			this.Cognome=Cognome;
			this.Email=Email;
			this.risposta=risposta;
		}
		public void registraMail() {
				if(risposta.toLowerCase() == "si") {
					System.out.println("Registrazione Email : ");
					Registrata = true;
				}
		}
		public void stampaDati() {
			System.out.println("Nome : " + Nome + "\n" + "Cognome : " + Cognome);
			System.out.println(Registrata);
			if(Registrata == true ) {
				System.out.println("Email : " + Email);
		}
	}
}
