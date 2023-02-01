Another way to ensure that [[SLAP HARD]] is implemented w

![[Pasted image 20230201121927.png]]

```java
if (!aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd))
  charge = quantity * plan.summerRate;
else
  charge = quantity * plan.regularRate + plan.regularServiceCharge;
```

```java
if (summer())
  charge = summerCharge();
else
  charge = regularCharge();
  
```

Ensure that you keep all the data in

