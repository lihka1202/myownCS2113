Again, this is primarily for code readability and so that it is generally easier to debug

```java
let averageAge = 0;
  let totalSalary = 0;
  for (const p of people) {
    averageAge += p.age;
    totalSalary += p.salary;
  }
  averageAge = averageAge / people.length;
```

```java
let totalSalary = 0;
  for (const p of people) {
    totalSalary += p.salary;
  }

  let averageAge = 0;
  for (const p of people) {
    averageAge += p.age;
  }
  averageAge = averageAge / people.length;
```