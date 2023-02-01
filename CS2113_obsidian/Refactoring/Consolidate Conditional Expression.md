This essentially ensures [[SLAP HARD]] and [[Keep the happy path prominent]]

```java
if (anEmployee.seniority < 2) return 0;
  if (anEmployee.monthsDisabled > 12) return 0;
  if (anEmployee.isPartTime) return 0;
```

Refactored down to:

```java 
if (isNotEligibleForDisability()) return 0;

  function isNotEligibleForDisability() {
    return ((anEmployee.seniority < 2)
            || (anEmployee.monthsDisabled > 12)
            || (anEmployee.isPartTime));
  }
```


ensuring that all the conditionals which can be consolidated are consolidated.




