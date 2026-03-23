public class ListaPaciente {
	No inicio;

	public boolean vazia() {
		return inicio == null;
	}

	public void inserirNoFinal(Paciente p) {

		if (vazia()) {
			inicio = new No(p);
			return;
		}

		No atual = inicio;
		while (atual.proximo != null) {
			atual = atual.proximo;
		}

		atual.proximo = new No(p);
	}

	public void listarTodos() {
		No atual = inicio;
		while (atual != null) {
			System.out.println(atual.paciente);
			atual = atual.proximo;
		}
	}

	public int contarPacientes() {
		No atual = inicio;
		int total = 0;
		while (atual != null) {
			total++;
			atual = atual.proximo;
		}
		return total;
	}

    public int contarIdosos() {
		No atual = inicio;
		int total = 0;
		while (atual != null) {
		    if (atual.paciente.idade >= 60)
			    total++;
			atual = atual.proximo;
		}
		return total;
    }
    
    public Paciente pacienteMaisVelho() {
		No atual = inicio;
		Paciente maisVelho = inicio.paciente;
		
		while (atual != null) {
		    if (atual.paciente.idade >= maisVelho.idade)
			    maisVelho = atual.paciente;
			atual = atual.proximo;
		}
		return maisVelho;
    }

	public Paciente buscarPorCPF(String cpf) {
		No atual = inicio;
		Paciente p = null;
		while (atual != null) {
			if (atual.paciente.cpf.equals(cpf)) {
				p = atual.paciente;
				break;
			}
			atual = atual.proximo;
		}
		return p;
	}

	public Paciente removerPorCPF(String cpf) {

		if (vazia())
			return null;

        // quando o paciente estiver no inicio da lista
		if (inicio.paciente.cpf.equals(cpf)) {
			No excluido = inicio;
			inicio = inicio.proximo;
			return excluido.paciente;
		}

		No atual = inicio;

		while (atual.proximo != null) {

			if (atual.proximo.paciente.cpf.equals(cpf)) {
				No excluido = atual.proximo;
				atual.proximo = excluido.proximo;
				return excluido.paciente;
			}

			atual = atual.proximo;
		}

		return null;
	}


}