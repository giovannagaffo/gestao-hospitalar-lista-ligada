public class Main
{
	public static void main(String[] args) {
	    
	    ListaPaciente pacientes = new ListaPaciente();
	    pacientes.inserirNoFinal(new Paciente("123","Ana",15, "Dor de cabeca"));
	    pacientes.inserirNoFinal(new Paciente("547","Pedro",20, "Dor nas costas"));
	    pacientes.inserirNoFinal(new Paciente("777","Joao Pedro",66, "Febre"));
	    pacientes.inserirNoFinal(new Paciente("999","Carla",60, "Resfriado"));
	    
	    //System.out.println(pacientes.inicio.paciente);
	    //System.out.println(pacientes.inicio.proximo.paciente);
	    
	    pacientes.listarTodos();
	    System.out.println("Total de pacientes: "+pacientes.contarPacientes());
	    System.out.println("Total de idosos: "+pacientes.contarIdosos());
	    System.out.println("Paciente mais velho: "+pacientes.pacienteMaisVelho());
	    
	    //String cpf="123";
	    //System.out.println("Procurando CPF: "+cpf+" -> "+pacientes.buscarPorCPF(cpf));
	    //System.out.println("Excluindo CPF: "+cpf+" -> "+pacientes.removerPorCPF(cpf));
	    
	    
	    //String cpf="547";
	    //System.out.println("Procurando CPF: "+cpf+" -> "+pacientes.buscarPorCPF(cpf));
	    //System.out.println("Excluindo CPF: "+cpf+" -> "+pacientes.removerPorCPF(cpf));
	    
	    
	    //pacientes.listarTodos();
	    //System.out.println("Total de pacientes: "+pacientes.contarPacientes());
	    
	}
}