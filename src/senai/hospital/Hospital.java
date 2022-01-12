package senai.hospital;

import java.time.LocalDate;

public class Hospital {

	public boolean agendaProcedimento(Procedimento procedimento, LocalDate data) {
		//if () <-- verifica se o procedimento pode ser agendado;
		
		return true;
	}
	
	/*
	 * N�o queremos usar nem esse m�todo nem o anterior.
	 * 
	 * Podemos definir uma interface gen�rica (um contrato) que atender� a todos os
	 * tipos!
	 */
	public boolean agendaConsulta(Consulta consulta, LocalDate data) {
		// verifica se a consulta pode ser agendada;
		
		return true;
	}
	
	
	// Esse m�todo atende aos dois tipos, utilizando a interface Agendavel
	public boolean realizaAgendamento(Agendavel agendavel, LocalDate data) {
		if (agendavel.verificaPossibilidadeAgendamento()) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Hospital hospital = new Hospital();

		Procedimento procedimento = new ExameImagem();
		Agendavel consulta = new Consulta();
		
		hospital.realizaAgendamento(consulta, LocalDate.now());
		hospital.realizaAgendamento(procedimento, LocalDate.now());
		
		procedimento.exibeTexto();
	}
}
