package main

import (
	"bytes"
	"fmt"
)

func main() {
	var x int

	fmt.Scanf("%d", &x)
	var output bytes.Buffer

	for i := 0; i < x; i++ {
		for j := 0; j < i; j++ {
			output.WriteString(" ")
		}

		for j := 0; j < x-i; j++ {
			output.WriteString("*")
		}

		output.WriteString("\n")
	}

	fmt.Print(output.String())
}
