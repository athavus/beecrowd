package main

import (
	"fmt"
)

func main() {
	var pi float64 = 3.14159

	var raio float64
	fmt.Scan(&raio)

	var area float64 = pi * (raio * raio)

	fmt.Printf("A=%.4f\n", area)
}