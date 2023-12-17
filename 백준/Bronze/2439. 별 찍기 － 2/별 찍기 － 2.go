package main

import (
	"fmt"
)

func main() {
	var x int

	fmt.Scanf("%d", &x)

	for i := 0; i < x; i++ {
		for j := 0; j < x-i-1; j++ {
			fmt.Print(" ")
		}

		for j := 0; j <= i; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
