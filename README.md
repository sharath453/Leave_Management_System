# Library Management System

This is a simple library management system that allows you to manage books in a PostgreSQL database. The system provides functionalities to insert, update, retrieve, and delete book records.

## Prerequisites

- Java Development Kit (JDK) installed
- Apache Maven installed
- PostgreSQL installed and configured
- A PostgreSQL database named `libraryDataManagementSystem`

## Setting Up the Database

1. Open pgAdmin or your preferred PostgreSQL client.
2. Create a database named `libraryDataManagementSystem`.
3. Execute the following SQL command to create the `book` table:

    ```sql
    CREATE TABLE book (
        id INT PRIMARY KEY,
        name VARCHAR(100),
        author VARCHAR(100),
        count INT,
        publication VARCHAR(100),
        price DECIMAL
    );
    ```

## Project Structure

- `src/main/java/Demo/book.java`: Defines the `book` class.
- `src/main/java/Demo/bookDriver.java`: Command-line interface for interacting with the book library system.
- `src/main/java/Demo/bookcrud.java`: Handles database operations.
- `pom.xml`: Maven configuration file.

## Running the Project

1. Clone the repository:

    ```sh
    git clone https://github.com/yourusername/Library_management_system.git
    cd Library_management_system
    ```

2. Open the project directory and configure the database connection details in the `bookcrud` class if needed.

3. Build the project using Maven:

    ```sh
    mvn clean install
    ```

4. Run the project:

    ```sh
    mvn exec:java -Dexec.mainClass="Demo.bookDriver"
    ```

## Usage

1. When prompted, choose an option:
    - `1`: Insert details of a book.
    - `2`: Update the price of a book.
    - `3`: Get details of a book by ID.
    - `4`: Get details of all books.
    - `5`: Delete a book by ID.

2. Follow the on-screen instructions to perform the desired operation.

## Dependencies

- PostgreSQL JDBC Driver (version 42.7.3)

The dependencies are managed in the `pom.xml` file.

## License

This project is licensed under the MIT License.

## I inserted a values in the database : 

![image](https://github.com/sharath453/Leave_Management_System/assets/152873318/5b93fd3a-15b1-488d-9746-e72db13cca3f)



