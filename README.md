<div align=center>

# DataBase
</div>



## About 



## TOC
- [About](#about)
- [TOC](#toc)
- [Connection To Database](#connection-to-database)
- [Data Storage](#data-storage)
- [Query Execution](#query-execution)
  - [Insert](#insert)
  - [Update](#update)
  - [Select](#select)



## Connection To Database
1. When connected to db private tunnel is created.
2. Connection sustain for 30 minutes if any queries send.
3. Connection uses TLS and https.
4. User have specific permissions to tables. example: ```SELECT, INSERT``` in table ```Location```.
5. Default user permission are none.
6. Every quarry is signed client of database have private secret key and database have public one.
7. No login form only private and public key.
8. Every login and query is saved in log file.



## Data Storage
1. Data structure is B+ Tree.
2. Data on disk is located like disk -> db folder -> table folder -> file -> page.
3. Each page is B+ Tree node.
4. To database folder only db have permission.
5. Data in folders are encrypted.
6. Before saving data into page we first store it in WAL.
7. Base on WAL we create delta changes.
8. Every hour database creates backup base on delta changes.
9. After backup we validate files only this that we change.
10. We restore backup using file validation.



## Query Execution
### Insert
### Update
### Select
