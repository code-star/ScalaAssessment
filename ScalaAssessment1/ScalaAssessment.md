# Scala Assessment

Please solve the following exercises. They are not deeply complicated, but will test your solving skills, code style, readability and robustness, as well as forward-thinking and extendability.

For each exercise, please also write unit tests in the appropriate files to verify your algorithms.

You have 1.5 hours.

## Exercise 1

The numbers represent incomes and the client only wants to factor in future income decreases, but wants to exclude projected increases. 

Provide a function that transforms a sequence of arbitrary numbers into a sequence of numbers which contains no increases, replacing increasing values with the previous non-increasing value. For example, the following sequence:

```scala
	List(8, 8, 10, 9, 7, 5, 5, 6, 6, 6, 3, 5)
```

after having passed through your function should become:

```scala
	List(8, 8, 8, 8, 7, 5, 5, 5, 5, 5, 3, 3)
```


Think of all cases, and try to make this function extensive.
