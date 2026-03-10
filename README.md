# 💱 Sistema de Conversão Monetária

Projeto desenvolvido em Java para realizar conversões entre moedas internacionais utilizando taxas de câmbio atualizadas em tempo real por meio de uma API pública.

---

## 📌 Objetivo

Este sistema foi criado com a finalidade de praticar:

* Consumo de API REST
* Manipulação de dados JSON
* Programação orientada a objetos
* Estruturas de decisão e repetição
* Organização de projetos Java

---

## ⚙️ Funcionalidades

O programa permite ao usuário converter valores entre diferentes moedas de forma simples através de um menu interativo no terminal.

Conversões disponíveis:

* Dólar (USD) → Real Brasileiro (BRL)
* Real Brasileiro (BRL) → Dólar (USD)
* Euro (EUR) → Real Brasileiro (BRL)
* Real Brasileiro (BRL) → Euro (EUR)
* Libra Esterlina (GBP) → Real Brasileiro (BRL)
* Real Brasileiro (BRL) → Libra Esterlina (GBP)

---

## 🧠 Como o sistema funciona

1. O usuário escolhe uma opção de conversão no menu.
2. Informa o valor que deseja converter.
3. O sistema consulta uma API de câmbio online.
4. A cotação atual é obtida em formato JSON.
5. O valor é convertido automaticamente.
6. O resultado é exibido na tela.

---

## 🏗️ Estrutura do Projeto

O projeto foi organizado seguindo boas práticas de separação de responsabilidades:

* **AplicacaoPrincipal** → Controla a execução do programa e interação com o usuário
* **ServicoCambioAPI** → Responsável por consumir a API de taxas de câmbio
* **CalculadoraCambio** → Realiza os cálculos de conversão
* **DadosCambio** → Representa os dados recebidos da API

---

## 🔌 Tecnologias Utilizadas

* Java 11+
* API HTTP Client nativa do Java
* Biblioteca Gson para manipulação de JSON

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto em sua IDE Java
3. Insira sua chave de API no arquivo `ServicoCambioAPI`
4. Execute a classe `AplicacaoPrincipal`

---

## 🔑 Observação Importante

Para o funcionamento correto, é necessário gerar uma chave gratuita em um serviço de taxas de câmbio e substituí-la no código-fonte.

---

## 🎓 Finalidade Acadêmica

Projeto desenvolvido para fins de estudo e prática de integração com APIs e desenvolvimento de aplicações Java orientadas a objetos.

---

## 👨‍💻 Autor
Henderson Chris C C Abreu
Desenvolvido para fins educacionais.
