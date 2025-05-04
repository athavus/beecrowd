package main

import (
	"fmt"
)

func main() {
	var a int
	fmt.Scan(&a)

	var b int
	fmt.Scan(&b)

	var c int
	fmt.Scan(&c)

	var d int
	fmt.Scan(&d)

	var diferenca int = a * b - c * d

	fmt.Println("DIFERENCA =", diferenca)
}