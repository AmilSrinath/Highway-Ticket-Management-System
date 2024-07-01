






+------------------+      +-------------------+      +------------------+      +------------------+
|      User        |      |      Vehicle      |      |      Ticket      |      |     Payment      |
+------------------+      +-------------------+      +------------------+      +------------------+
| *userId (PK)     |1    M| *vehicleId (PK)   |1    M| *ticketId (PK)   |1    1| *paymentId (PK)  |
|  name            +------+  licensePlate     +------+  vehicleId (FK)  +------+  ticketId (FK)   |
|  email           |      |  model            |      |  userId (FK)     |      |  userId (FK)     |
|  password        |      |  userId (FK)      |      |  issueDate       |      |  amount          |
|  role            |      +-------------------+      |  status          |      |  paymentDate     |
+------------------+                                 +------------------+      +------------------+
