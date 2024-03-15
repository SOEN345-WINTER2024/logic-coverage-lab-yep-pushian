Yeprem Antranik 40204291

Step 1: Logic Expression - (a || (b && c)

Step 2: Get Predicate Coverage:

1.p = true:

a=true
b=true / c = true


2.p = false:
a= false
b = false/ c= false 


Step 3: Clause Coverage

<img width="691" alt="313265960-20ac6f75-b457-4174-b67d-bd92765b5df5" src="https://github.com/SOEN345-WINTER2024/logic-coverage-lab-yep-pushian/assets/102338675/b8b66236-10a7-4e74-9d21-27e1743258c7">


Step 4: Combinational Coverage


<img width="475" alt="313268072-517e2ac2-9858-462b-902c-b3343b1c88f6" src="https://github.com/SOEN345-WINTER2024/logic-coverage-lab-yep-pushian/assets/102338675/7c5c0753-7fed-4df2-bbdb-cf414b0e1eb3">


Step 5: CACC

<img width="1352" alt="313268208-cf1ba5d2-ac2b-44f8-89d7-8ac07caf263d" src="https://github.com/SOEN345-WINTER2024/logic-coverage-lab-yep-pushian/assets/102338675/930737ef-bc11-41f9-9a9f-9c99f67551ca">


Step 6: RACC

<img width="704" alt="Screenshot 2024-03-15 at 3 00 05 PM" src="https://github.com/SOEN345-WINTER2024/logic-coverage-lab-yep-pushian/assets/102338675/645035af-ff44-450d-8a83-a6407b245a92">


Step 7:

Pc = (Pc=true + Pb=true) + (Pc=false + Pb=true) + (Pc=true + Pb=false) + (Pc=false + Pb=false)
   = !a && b











