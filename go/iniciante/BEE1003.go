package main

import (
	"fmt"
)

func main() {
	var a int
	fmt.Scan(&a)
	var b int
	fmt.Scan(&b)

	var soma int = a + b

	fmt.Println("SOMA =", soma)
}