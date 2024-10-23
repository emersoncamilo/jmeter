# JMeter Example Test Performance

---

## 📁 Estrutura do Projeto

---

## 📦 Commands

### Using Maven

1. **Navigate to the Project Directory:**

   ```bash
   cd path\to\your\app
   ```

2. **Clean and Package the Application:**  
   Run the following command to generate a `.jar` file:

   ```bash
   mvn clean package
   ```

    - **clean:** Removes any previous build files.
    - **package:** Packages the project into a `.jar`.

3. **Locate the Jar File:**  
   After running the command, the jar will be available in the `target/` folder:

   ```
   target/your-application-name-version.jar
   ```

4. **Run the Jar (Optional):**  
   If you want to run the jar file, use the following command:

   ```bash
   java -jar app/target/performance-0.0.1-SNAPSHOT.jar
   ```

---

## 🚀 Test 1 - Load Testing

**Goal:** Measure how the system performs under a specific, expected load by simulating a typical number of concurrent users (e.g., 100).

- **Monitor:** Response times and error rates.
- **Endpoint:** `/customers` (GET request to retrieve a customer list).

---

## 🤝 Contribuição

Fique à vontade para sugerir melhorias ou abrir issues para discutir problemas e ideias!

---

## 📢 Contato

Caso tenha interesse em discutir mais sobre o projeto ou oportunidades de colaboração, você pode entrar em contato pelo [LinkedIn](https://www.linkedin.com/in/ecamiloit/).
