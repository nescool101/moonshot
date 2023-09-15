# moonshot
Moonshot base code

on cmd do>
docker pull gvenzl/oracle-xe
docker run -p 1521:1521 -e  ORACLE_PASSWORD=password gvenzl/oracle-xe
if all is okay you should get something like>
---
2023-09-15T22:44:15.157021+00:00
XEPDB1(3):Opening pdb with Resource Manager plan: DEFAULT_PLAN
Pluggable database XEPDB1 opened read write
Starting background process CJQ0
2023-09-15T22:44:15.459354+00:00
CJQ0 started with pid=63, OS id=208
Completed: ALTER DATABASE OPEN
---

docker-compose up --build
to close the app>
docker-compose down

