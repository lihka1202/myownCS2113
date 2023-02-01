
A generic logic idea, whenever you have a **negative conditional, its kinda hard to understand and read. So it generally makes more sense to note use too many ! statements**

```java
if ( !isSummer( date ) )
  charge = winterCharge( quantity );
 else
  charge = summerCharge( quantity );
```

```java
if ( isSummer( date ) )
  charge = summerCharge( quantity );
 else
  charge = winterCharge( quantity );
```