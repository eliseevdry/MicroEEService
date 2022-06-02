This is a simple application. It includes Unit Tests, Logging, Spring, Jersey, works with PostgreSQL database, Maven.
The Database contains tables of universities, faculties, students and student documents.
The application allows you to find out if a person is a student and, if so, at which university and at which faculty.

After starting the server, send a POST request to

_______________http://localhost:8080/rest/student_______________

in JSON format:
{
  "lastName" : "Last",
  "firstName" :"First",
  "middleName" :"Middle",
  "dateOfBirth" :"12.04.2000",
  "passportSeria" :"1111",
  "passportNumber" :"222222",
  "passportDate" :"30.04.2014",
}

Do not forget change DB options: login, password...
and hibernate.hbm2ddl.auto -> create