package senai.hospital;

public class Consulta implements Agendavel {

	@Override
	public boolean verificaPossibilidadeAgendamento() {
		if (existeMedicoDisponivel()) {
			return true;
		}
		
		return false;
	}

	
	private boolean existeMedicoDisponivel() {
		return true;
	}
}
