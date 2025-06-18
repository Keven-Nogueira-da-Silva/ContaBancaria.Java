📄 Descrição do Projeto - Sistema Bancário em Java
Nome do Projeto: Sistema Bancário Simples

Descrição Geral:
Este projeto é um sistema bancário simples desenvolvido em Java que simula operações básicas de uma conta bancária. O sistema permite ao usuário realizar depósitos, saques, consultar saldo e encerrar o atendimento, mostrando um resumo final da conta.

🏗️ Funcionalidades Implementadas:
Cadastrar Nome e Banco:

Validação para impedir que o nome ou banco contenham números.

Exibe mensagens indicando sucesso ou erro no cadastro.

Depositar Dinheiro:

Aceita valores até R$3000,00 por depósito.

Atualiza o saldo da conta.

Caso o valor ultrapasse o limite, exibe uma mensagem de erro.

Sacar Dinheiro:

Verifica se há saldo suficiente antes de permitir o saque.

Atualiza o saldo após saque.

Exibe mensagens indicando sucesso ou erro.

Consultar Saldo:

Exibe o saldo atual da conta.

Encerrar Atendimento:

Mostra um resumo final com:

Nome do cliente

Banco cadastrado

Saldo atual

🖥️ Estrutura do Projeto:
ContaBancaria (Classe):

Armazena os dados e as operações da conta.
Métodos principais: setNome(), setBanco(), setValorParaDepositar(), setSacarValor(), getSaldo(), etc.
Inclui validações básicas para entradas inválidas.
Main (Classe com método main):
Controla a interação com o usuário via console.
Utiliza Scanner para ler entradas.
Oferece um menu de opções dentro de um laço while.
