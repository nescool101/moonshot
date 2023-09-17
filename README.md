# Moonshot

Moonshot base code repository contains the necessary instructions to set up and run the application and associated services in Docker containers. Here are the steps to get started:

## Setting Up the Oracle Database

First, pull the Oracle XE image from Docker Hub:

##  terminal instructions
```
docker pull gvenzl/oracle-xe
docker run -p 1521:1521 -e  ORACLE_PASSWORD=password gvenzl/oracle-xe
```

if all is okay you should get something like>
```
2023-09-15T22:44:15.157021+00:00
XEPDB1(3):Opening pdb with Resource Manager plan: DEFAULT_PLAN
Pluggable database XEPDB1 opened read write
Starting background process CJQ0
2023-09-15T22:44:15.459354+00:00
CJQ0 started with pid=63, OS id=208
Completed: ALTER DATABASE OPEN
```

to run the calculator use > docker run -p 8082:8080 quay.io/l2x6/calculator-ws:1.0

## Services

* http://localhost:8082/calculator-ws/CalculatorService?wsdl
* http://localhost:8082/calculator-ws/BasicAuthCalculatorService?wsdl
* http://localhost:8082/calculator-ws/BareCalculatorService?wsdl
* http://localhost:8082/calculator-ws/WssCalculatorService?wsdl

docker-compose up --build
to close the app>
docker-compose down

to create your classes based on wsdl, run this command in the terminal>
```
wsimport -keep -verbose /yourRute/CalculatorService.wsdl
```
