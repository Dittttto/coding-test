package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var reader *bufio.Reader = bufio.NewReader(os.Stdin)
	var writer *bufio.Writer = bufio.NewWriter(os.Stdout)
	var n int
	fmt.Fscanln(reader, &n)

	for i := 0; i < n; i++ {
		for j := 0; j < 2*n; j++ {
			if j >= i+1 && j < 2*n-i-1 {
				writer.WriteString(" ")
			} else {
				writer.WriteString("*")
			}
		}
		writer.WriteString("\n")
	}

	for i := n; i < 2*n-1; i++ {
		for j := 0; j < 2*n; j++ {
			if j >= 2*n-i-1 && j < i+1 {
				writer.WriteString(" ")
			} else {
				writer.WriteString("*")
			}
		}
		writer.WriteString("\n")
	}

	fmt.Fprintln(writer)
	defer writer.Flush()
}
