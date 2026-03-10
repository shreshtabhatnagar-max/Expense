FROM openjdk:17

WORKDIR /app

COPY Expense_Tracker2/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
