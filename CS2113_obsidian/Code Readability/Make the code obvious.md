Try to make the code as obvious as possible, try not to use fancy tricks which could result in issues with the SDK types

For java the following tricks are great

1. Use explicit type conversion instead of implicit type conversion.
2. Use parentheses/braces to show groupings even when they can be skipped.
3. Use enumerations when a certain variable can take only a small number of finite values. For example, instead of declaring the variable 'state' as an integer and using values 0, 1, 2 to denote the states 'starting', 'enabled', and 'disabled' respectively, declare 'state' as type `SystemState` and define an enumeration `SystemState` that has values `'STARTING'`, `'ENABLED'`, and `'DISABLED'`.
4. 