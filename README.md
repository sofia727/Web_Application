# 💻 Web Application — Sistema de Portfólio

Aplicação web desenvolvida em **Java (Jakarta EE)** utilizando a arquitetura **MVC** (*Model-View-Controller*), gerenciamento de dependências com **Maven** e persistência de dados em **MySQL**. Projeto acadêmico desenvolvido no contexto do **IFC — Campus Videira**.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 23
* **Especificação Web:** Jakarta EE (Servlets 6.0 / JSP 4.0 / JSTL 3.0)
* **Servidor de Aplicação:** Apache Tomcat 11.0 (compatível com Tomcat 10.1+)
* **Gerenciador de Dependências:** Apache Maven
* **Banco de Dados:** MySQL (`mysql-connector-j`)
* **Segurança:** jBCrypt (criptografia de senhas)
* **Front-end:** HTML5, CSS3, JavaScript e Bootstrap 5

---

## 📂 Estrutura do Projeto

```text
Web_Application/
├── src/
│   └── main/
│       ├── java/
│       │   ├── controller/     # Servlets e mapeamento de rotas (@WebServlet)
│       │   ├── dao/            # Conexão com o banco (ConexaoDB) e operações SQL
│       │   └── model/          # Entidades e regras de negócio (Usuario, Projeto, Postagem)
│       └── webapp/
│           ├── assets/         # Arquivos estáticos (CSS, JS, Bootstrap, imagens)
│           └── WEB-INF/        # Configurações (web.xml) e páginas de erro (404/500)
├── pom.xml                     # Dependências e configuração de build do Maven
└── portfolio.sql               # Script SQL para criação do banco e tabelas
```

---

## ⚙️ Pré-requisitos

Antes de rodar o projeto em uma máquina nova, garanta que você possui:

1. **JDK 23** instalado (ex: Azul Zulu 23 ou Eclipse Temurin 23).
2. **Eclipse IDE for Enterprise Java and Web Developers** (recomendado para suporte nativo a servidores e Maven).
3. **Apache Tomcat 11.0** (versão *64-bit Windows zip* extraída em uma pasta local, como `C:\apache-tomcat-11.0.x`).
4. **MySQL Server** (via **XAMPP**, Laragon ou MySQL Workbench) para persistência de dados.

---

## 🚀 Como Configurar e Inicializar o Projeto

### 1. Clonar e Importar no Eclipse
1. Clone o repositório:
   ```bash
   git clone https://github.com/sofia727/Web_Application.git   ```
2. No Eclipse, importe como projeto Maven:
   * **File** > **Import...** > **Maven** > **Existing Maven Projects** > selecione a pasta do projeto > **Finish**.
3. Atualize as dependências:
   * Clique com o botão direito no projeto > **Maven** > **Update Project...** > marque **Force Update of Snapshots/Releases** > **OK**.

---

### 2. Configurar o Banco de Dados (MySQL / XAMPP)
1. Inicie o serviço do **MySQL** (no painel do XAMPP, clique em **Start** na linha do MySQL).
2. Acesse o **phpMyAdmin** (`http://localhost/phpmyadmin`) ou seu cliente SQL preferido.
3. Importe e execute o arquivo **`portfolio.sql`** localizado na raiz deste repositório.
4. Confira se as credenciais (URL, usuário e senha) na classe `src/main/java/dao/ConexaoDB.java` correspondem ao seu ambiente local (no XAMPP padrão: usuário `root` e senha vazia `""`).

---

### 3. Configurar e Inicializar o Servidor (Apache Tomcat 11)
1. **Adicionar o Runtime no Eclipse:**
   * Vá em **Window** > **Preferences** > **Server** > **Runtime Environments** > **Add...**
   * Selecione **Apache Tomcat v11.0** > **Next** > aponte para a pasta onde o Tomcat foi extraído e clique em **Finish**.
2. **Vincular o Servidor ao Projeto:**
   * Clique com o botão direito no projeto > **Properties** > **Targeted Runtimes** > marque **Apache Tomcat v11.0** > **Apply and Close**.
3. **Subir o Servidor:**
   * Caso a aba **Servers** não esteja visível, abra em **Window** > **Show View** > **Other...** > pesquise por **Servers**.
   * Clique com o botão direito sobre o projeto > **Run As** > **Run on Server** > selecione **Apache Tomcat v11.0** > **Finish**.
   * Aguarde a mensagem `Server startup in [xxx] milliseconds` na aba **Console**.

---

## 🌐 Acesso e Rotas Principais

Com o servidor rodando na porta padrão (`8080`), a aplicação responde no contexto `/Portfolio`:

* **URL Base:** `http://localhost:8080/Portfolio/`
* **Rotas mapeadas (`ProjetoController`):**
  * `/listaProjeto`
  * `/cadastroProjeto`
  * `/editarProjeto`
  * `/selecaoProjeto`
  * `/excluirProjeto`

---

## 📝 Notas de Desenvolvimento
* Caso a porta `8080` já esteja em uso por outro serviço, dê um duplo clique no servidor na aba **Servers** e altere a porta **HTTP/1.1** para `8081`.
* Se o Eclipse exibir avisos de validação em arquivos minificados de terceiros (como `bootstrap.bundle.min.js`), desative a validação de JavaScript em **Properties > Validation**.
