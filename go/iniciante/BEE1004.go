package main

import (
	"fmt"
)

func main() {
	var a int
	fmt.Scan(&a)

	var b int
	fmt.Scan(&b)

	var prod int = a * b

	fmt.Println("PROD =", prod)
}