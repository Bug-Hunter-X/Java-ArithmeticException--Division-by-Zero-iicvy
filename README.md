# Java ArithmeticException: Division by Zero

This repository demonstrates a common Java error: attempting to divide by zero, leading to an `ArithmeticException`. The `Bug.java` file contains the erroneous code, while `Solution.java` provides a corrected version.

## Bug Description
The code attempts to divide 5 by 0, which is mathematically undefined and causes a runtime exception.

## Solution
The `Solution.java` file addresses the issue by adding a check to prevent division by zero. Before performing the division, it verifies that the denominator is not zero. If it is, it handles the exception gracefully (e.g., prints an error message or returns a default value).