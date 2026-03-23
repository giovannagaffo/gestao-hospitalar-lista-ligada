# gestao-hospitalar-lista-ligada
Sistema de gerenciamento de pacientes desenvolvido em Java utilizando Lista Encadeada (Linked List) utilizando os princípios da POO. Inclui funcionalidades de inserção, busca, remoção por CPF e estatísticas de idade, ou seja, gerenciamento dinâmico de pacientes sem o uso de coleções prontas do Java (como ArrayList), focando na lógica de manipulação de ponteiros e nós. 

- **Inserção Dinâmica:** Adiciona pacientes ao final da lista.
- **Busca por CPF:** Localiza um paciente específico percorrendo a estrutura.
- **Remoção Seletiva:** Remove pacientes em qualquer posição (início, meio ou fim) através do CPF, ajustando os ponteiros dos nós.
- **Estatísticas de Dados:**
  - Contagem total de pacientes.
  - Filtro para contagem de idosos (idade ≥ 60).
  - Identificação do paciente com a maior idade na lista.

- **Nó (Node):** Classe que encapsula o objeto Paciente e a referência para o próximo elemento.
- **Lista Ligada:** Estrutura onde cada elemento aponta para o próximo, permitindo alocação dinâmica de memória.
- **Iteração de Ponteiros:** Percorrimento da lista para operações de leitura e exclusão.


