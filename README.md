# bank-kata
## User Stories

·         US 1:

In order to save money

As a bank client

I want to make a deposit in my account

 

·         US 2:

In order to retrieve some or all of my savings

As a bank client

I want to make a withdrawal from my account

 

·         US 3:

In order to check my operations

As a bank client

I want to see the history (operation, date, amount, balance) of my operations
## Building and running
To clone, build and run the project (with maven) tab the following commands:

```sh
git clone https://github.com/aniseddali/bank-kata
cd bank-kata
mvn clean compile test exec:java -Dexec.mainClass="com.kata.bankAccount.Main"
```
