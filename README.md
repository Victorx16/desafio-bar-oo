# 🍻 Desafio: Conta de Bar (POO) - DevSuperior

Este projeto é a resolução do desafio "Conta de Bar", proposto no curso DevSuperior. O objetivo é aplicar os conceitos de Programação Orientada a Objetos (POO) em Java para criar um sistema que calcula a conta de um cliente com base em seu consumo e em regras de negócio específicas.

---

## ✨ Conceitos Aplicados

Este projeto foi uma oportunidade para praticar e solidificar os seguintes conceitos:

* **Programação Orientada a Objetos (POO):** Foco na criação de classes que modelam entidades do mundo real.
* **Encapsulamento:** A classe `Bill` encapsula todos os dados (atributos) e regras de negócio (métodos) relacionados à conta, tornando o código principal mais limpo e organizado.
* **Separação de Responsabilidades:** A classe `Program` cuida da interação com o usuário (entrada e saída de dados), enquanto a classe `Bill` cuida de toda a lógica de cálculo.
* **Leitura de Dados:** Utilização da classe `Scanner` para ler e validar a entrada de dados do usuário no console.

---

##  रूल Regras de Negócio

O sistema calcula o valor final da conta com base nas seguintes regras:

#### Ingresso
* **Homem:** R$ 10.00
* **Mulher:** R$ 8.00

#### Consumo
* **Cerveja:** R$ 5.00
* **Refrigerante:** R$ 3.00
* **Espetinho:** R$ 7.00

#### Couvert Artístico
* **Taxa Padrão:** R$ 4.00
* **Isenção:** Se o valor do consumo for **maior que R$ 30.00**, o couvert é isento (R$ 0.00).

---

## 📂 Estrutura do Projeto

O projeto está organizado em duas classes principais, seguindo a separação de pacotes `application` e `entities`:

* **`entities/Bill.java`**: A classe que representa a conta do cliente. Ela contém os atributos (`gender`, `beer`, etc.) e os métodos responsáveis por todos os cálculos (`feeding()`, `cover()`, `ticket()`, `total()`).

* **`application/Program.java`**: A classe principal que contém o método `main`. É responsável por interagir com o usuário, ler os dados do pedido, instanciar o objeto `Bill` e, por fim, apresentar o relatório final chamando os métodos do objeto.

---

## 🚀 Como Executar

1.  Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2.  Clone ou baixe o código deste repositório.
3.  Abra um terminal ou prompt de comando e navegue até a pasta raiz do projeto.
4.  Compile os arquivos Java:
    ```bash
    javac application/Program.java entities/Bill.java
    ```
5.  Execute o programa:
    ```bash
    java application.Program
    ```
6.  Siga as instruções no console para inserir os dados do cliente.

---

## 👨‍💻 Autor

* **Victor Xavier**
