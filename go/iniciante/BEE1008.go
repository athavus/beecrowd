package main

import (
	"fmt"
)

func main() {
	var number int
	fmt.Scan(&number)

	var hours int
	fmt.Scan(&hours)

	var salary float64
	fmt.Scan(&salary)

	var totalSalary float64 = salary * float64(hours)

	fmt.Println("NUMBER =", number)
	fmt.Printf("SALARY = U$ %.2f\n", totalSalary)
}