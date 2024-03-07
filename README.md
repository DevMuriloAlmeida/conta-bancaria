<h1 align=center>MOVIMENTAÇÃO DE CONTA BANCÁRIA</h1>

Desafio proposto no curso `Java: criando a sua primeira aplicação` da `Alura`

# 🔨Objetivos do desafio
- O objetivo era desenvolver uma aplicação que simulasse uma conta bancária
- Deve conter 1 usuário com: Nome, Tipo de Conta e Saldo
- Um menu para realizar as operações: Consultar saldo, Depositar valor, Sacar valor e Sair
- O menu deve aparecer constante até o usuário pedir para sair
- Caso digite uma opção inexistente deve informar essa ação

# 💻Minha lógica do código
Utilizei o comando `While` para criar um laço de repetição e poder repetir as ações do menu até o usuário querer sair.

Para iterromper esse laço crie uma variável `sair` booleana com o valor `false`, e utilizei a expressão `while (sair != true)`. Quando o usuário selecionar a opção sair, essa variavel receberá o valor `true` interrompendo o loop.

Utilizei o comando `Switch` para realizar cada ação selecionada no menu pelo usuário.

Crie métodos static para realizar cada ação do menu: Consultar Saldo, Depositar Valor e Sacar Valor.
