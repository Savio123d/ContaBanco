# Conta Bancária via Terminal - Desafio DIO

Este projeto é o resultado de um desafio de código proposto no bootcamp da [DIO](https://www.dio.me/). O objetivo era criar uma aplicação simples em Java que simula a abertura de uma conta bancária, recebendo dados do usuário via terminal e exibindo uma mensagem de confirmação no final.

## 📝 Descrição do Projeto

A aplicação `ContaTerminal` permite que o usuário insira informações como número da conta, agência, nome do cliente e saldo inicial. Após a inserção dos dados, o sistema exibe uma mensagem consolidada com todas as informações fornecidas, confirmando a criação da conta.

## ⚙️ Funcionalidades

-   Recebe dados do usuário de forma interativa pelo terminal.
-   Armazena informações da conta (número, agência, nome e saldo).
-   Exibe uma mensagem final formatada com os dados da conta criada.

## 💻 Tecnologias Utilizadas

-   **Linguagem:** Java
-   **Entrada de Dados:** Classe `Scanner` para interação com o usuário no terminal.

## 📁 Estrutura de Pastas e Arquivos

O projeto está organizado da seguinte forma:

```
/
├── src/
│   ├── Main.java           # Classe principal que executa a aplicação
│   └── ContaTerminal.java  # Classe que representa a conta bancária
├── .gitignore              # Arquivos e pastas ignorados pelo Git
└── README.md               # Documentação do projeto
```

## ▶️ Como Executar o Projeto

Para executar este projeto localmente, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd seu-repositorio/src
    ```

3.  **Compile os arquivos Java:**
    ```bash
    javac Main.java ContaTerminal.java
    ```

4.  **Execute a aplicação:**
    ```bash
    java Main
    ```

## 💡 Exemplo de Uso

Ao executar o programa, o terminal solicitará as informações da conta. Veja um exemplo de interação:

```bash
Informe o número da conta (ex: 1021): 
1021
Informe a agência (ex: 067-8): 
067-8
Informe o nome: 
Mario Andrade
Informe o saldo (use ponto para decimais, ex: 237.48): 
237.48
```

Após preencher os dados, a seguinte mensagem será exibida:

```
Olá Mario Andrade, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```
